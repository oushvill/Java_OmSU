package org.example.Vychazhnikov;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class MainTest {

    @Test
    public void mainFile() throws Exception {
        File file = new File("C://Users/nv025/Java IdeaProjects/SiPPO/dataTest.txt");
        Scanner read = new Scanner(file);
        double arr[] = new double[3];
        int i = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String s;
            while (true) {
                if (read.hasNextDouble()) {
                    arr[i] = read.nextDouble();
                    i++;
                }
                if (read.hasNext()) read.next();
                else break;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Point2D res = Fibonacci.searchMinExt(1,new Point2D(arr[0], 0), new Point2D(arr[2], 0));
        Point2D res1 = new Point2D(4, Point2D.function(4));
        Assert.assertEquals(res, res1);
    }
}