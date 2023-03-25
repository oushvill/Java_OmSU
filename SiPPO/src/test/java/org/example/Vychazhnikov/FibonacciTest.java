package org.example.Vychazhnikov;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    private static final double ε = 0.01; //Точность

    //Тест на числа Фибоначчи
    @Test
    public void testFibNumbs() {
        Fibonacci f = new Fibonacci(1);
        Assert.assertEquals(1, f.getFibN(),ε);

        f = new Fibonacci(2);
        Assert.assertEquals(2, f.getFibN(),ε);

        f = new Fibonacci(3);
        Assert.assertEquals(3, f.getFibN(),ε);

        f = new Fibonacci(4);
        Assert.assertEquals(5, f.getFibN(),ε);

        f = new Fibonacci(10);
        Assert.assertEquals(89, f.getFibN(),ε);
    }

    //Поиск экстремумы
    @Test
    public void testSearchMinExt() throws Exception {
        Point2D p1 = new Point2D(0.3595, 0);
        Point2D p2 = new Point2D(0.3707, 0);
        Point2D res = Fibonacci.searchMinExt(1, p1, p2);
        Point2D res1 = new Point2D(0.3595, Point2D.function(0.3595));
        Assert.assertEquals(res.getX(), res1.getX(), ε);
        Assert.assertEquals(res.getY(), res1.getY(), ε);
    }
}