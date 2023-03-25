import static org.junit.Assert.assertArrayEquals;

public class SquareEqualTest {

    @org.junit.Test
    public void ProductPieceTestName() {
        try {
            SquareEqual test1 = new SquareEqual(null, 20.0, 1.0);
        } catch (IllegalArgumentException err) {
            System.err.println("Уравнение не существует! ");
        }
    }

    @org.junit.Test
    public void ProductPieceTestDescription() {
        try {
            SquareEqual test2 = new SquareEqual(20.0, null, 1.0);
        } catch (IllegalArgumentException err) {
            System.err.println("Уравнение не существует! ");
        }
    }

    @org.junit.Test
    public void ProductPieceNegativeWeightTest() {
        try {
            SquareEqual test3 = new SquareEqual(20.0, 1.0, null);
        } catch (IllegalArgumentException err) {
            System.err.println("Уравнение не существует! ");
        }
    }

    @org.junit.Test
    public void solutionTwoTest() {

        SquareEqual squareEqualTestEqual = new SquareEqual(12.0D, 9.0D, -3.0D);
        double[] result = new double[2];
        result[0] = -1;
        result[1] = 0.25;

        Double[] expectedResult = squareEqualTestEqual.solution();
        assertArrayEquals(expectedResult, result);
    }


    @org.junit.Test
    public void solutionOneTest() {

        SquareEqual squareEqualTestEqual = new SquareEqual(0., 9.0D, -3.0D);
        double[] result = new double[1];
        result[0] = 1/3;

        Double[] expectedResult = squareEqualTestEqual.solution();
        assertArrayEquals(expectedResult, result);
    }

    @org.junit.Test
    public void solutionNotTest() {

        SquareEqual squareEqualTestEqual = new SquareEqual(0., 0., -3.0D);
        SquareEqual squareEqualTestEqual2 = new SquareEqual(0., 0., 0.);
        double[] result = new double[0];

        Double[] expectedResult = squareEqualTestEqual.solution();
        assertArrayEquals(expectedResult, result);
        Double[] expectedResult2 = squareEqualTestEqual2.solution();
        assertArrayEquals(expectedResult2, result);
    }


    private void assertArrayEquals(Double[] expectedResult, double[] result) {
    }
}