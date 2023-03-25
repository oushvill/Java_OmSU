package org.example.Vychazhnikov;

import org.junit.Test;

import static org.junit.Assert.*;

public class Point2DTest {

    @Test
    public void constructorTest1() {
        Point2D point = new Point2D(10, 20);
        assertEquals(10.0, point.getX(), 0.000001);
        assertEquals(20.0, point.getY(), 0.000001);
    }

    //
    @Test
    public void constructorTest2() {
        Point2D point = new Point2D();
        assertEquals(0.0, point.getX(), 0.000001);
        assertEquals(0.0, point.getY(), 0.000001);
    }
}