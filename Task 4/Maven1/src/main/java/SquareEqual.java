import java.util.Arrays;
import java.util.Objects;

public class SquareEqual
{
    private Double a;
    private Double b;
    private Double c;

    public SquareEqual(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double[] solution() {
        Double[] res = new Double[2];

        if (a != 0) {
            double D = b * b - 4 * a * c;

            if (D > 0) {
                res[0] = (-b - Math.sqrt(D)) / (2 * a);
                res[1] = (-b + Math.sqrt(D)) / (2 * a);
            } else if (D == 0) {
                res[0] = -b / (2 * a);
            }
        } else if (b != 0){
            res[0] = -c / b;
        } else {
            if (c == 0) {
                res[0] = Double.POSITIVE_INFINITY;
                res[1] = Double.POSITIVE_INFINITY;
            }
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SquareEqual that = (SquareEqual) o;
        return Double.compare(that.a, a) == 0 && Double.compare(that.b, b) == 0 && Double.compare(that.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    public static void main(String[] args) {
        SquareEqual squareEqual = new SquareEqual(12.0, 9.0, -3.0);
        System.out.println(Arrays.toString(squareEqual.solution()));
    }
}

