package org.example.Vychazhnikov;

public class Fibonacci {

    private double fibN;
    private double fibA;
    private double fibB;

    public Fibonacci() {
        this.fibN = fibN;
        this.fibA = fibA;
        this.fibB = fibB;
    }

    private double fibNumbs(double N) {
        double fibaA, fibaB;
        if (N == 0) {
            return N+1;
        }
        if (N == 1) {
            return N;
        }else {
            fibaA = fibNumbs(N - 1);
            fibaB = fibNumbs(N - 2);
            return (fibaA + fibaB);
        }
    }

    public Fibonacci(double n) {
        if (n == 0 || n == 1) {
            fibA = 0;
            fibB = 0;
            fibN = 1;
        } else {
            fibA = fibNumbs(n - 1);
            fibB = fibNumbs(n - 2);
            fibN = fibA + fibB;
        }
    }

    public double getFibN() {
        return fibN;
    }

    public double getFibA() {
        return fibA;
    }

    public double getFibB() {
        return fibB;
    }

    public static Point2D searchMinExt(double N, Point2D pLeft, Point2D pRight) throws Exception {
        double a = pLeft.getX();
        double b = pRight.getX();
        double x, y;
        double x1, x2, λ, μ;
        System.out.println("\nЗадано: Количество итераций " + N + " на отрезке [" + a + "; " + b + "]");
        Fibonacci fN = new Fibonacci(N);
        x1 = (a + ((b - a) * ((double) fN.getFibB() / (double) fN.getFibN())));
        x2 = (a + ((b - a) * ((double) fN.getFibA() / (double) fN.getFibN())));
        λ = Point2D.function(x1);
        μ = Point2D.function(x2);
        System.out.println("λ " + λ);
        System.out.println("μ " + μ + "\n");
        while (N > 0 && x1 != x2) {
            if (λ < μ) {
                b = x2;
                x2 = x1;
                x1 = a + b - x2;
                μ = λ;
                λ = Point2D.function(x1);
                System.out.println("x1 " + x1);
                System.out.println("x2 " + x2 + "\n");
            } else {
                a = x1;
                x1 = x2;
                λ = μ;
                μ = Point2D.function(x2);
                x2 = a + b - x1;
                System.out.println("x1 " + x1);
                System.out.println("x2 " + x2 + "\n");
            }
            N++;

        }
        x = (x2);
        y = Point2D.function(x);
        System.out.println(new Point2D(x, y));
        return new Point2D(x, y);
    }
}
