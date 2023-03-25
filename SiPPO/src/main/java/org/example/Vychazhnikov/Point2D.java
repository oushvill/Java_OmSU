package org.example.Vychazhnikov;

import java.util.Objects;

public class Point2D {
    private double x, y;
    //конструктор Point2D с произвольными значениями координат
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //конструктор Point2D без параметров, создающий точку в начале координат
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //ФУНКЦИЯ
    public static double function(double point) {
        return Math.pow(point, 3) + (point) + 1 / (point);
    }

    @Override
    public String toString() {
        return "Экстремума [" +
                "x=" + x +
                "; f(x)=" + y +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point2D)) return false;
        Point2D point2D = (Point2D) o;
        return x == point2D.x &&
                y == point2D.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }
}
