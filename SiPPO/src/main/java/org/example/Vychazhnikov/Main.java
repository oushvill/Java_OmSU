package org.example.Vychazhnikov;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IllegalAccessException {
        Scanner in = new Scanner(System.in);
        double n = 0;
        double a = 0, b = 0;
        System.out.println("Для ввода данных через консоль, нажмите '1' \nДля ввода данных через файл, нажмите '2'");
        int z = in.nextInt();
        if (z == 1 || z == 2) {
            if (z == 1) {
                System.out.print("\nВведите количество итераций: ");
                n = in.nextInt();
                System.out.print("Введите левую границу: ");
                a = in.nextDouble();
                System.out.print("Введите правую границу: ");
                b = in.nextDouble();
                System.out.println("\nГотово!");
            }

            if (z == 2) {
                double[] arr = new double[3];
                int i = 0;

                File file = new File("C://Users/nv025/Java IdeaProjects/SiPPO/data.txt");
                Scanner read = new Scanner(file);

                while (true) {
                    if (read.hasNextDouble()) {
                        arr[i] = read.nextDouble();
                        i++;
                    }
                    if (read.hasNext()) read.next();
                    else break;
                }
                n = arr[0];
                a = arr[1];
                b = arr[2];
            }

            Point2D p1 = new Point2D(a, 0);
            Point2D p2 = new Point2D(b, 0);
            try {
                Point2D res = Fibonacci.searchMinExt(n, p1, p2);
            } catch (Exception e) {
                System.out.println("Точка минимума не найдена!");
            }
        } else {
            System.out.print("Ошибка! Число введено не верно.");
        }
    }
}
