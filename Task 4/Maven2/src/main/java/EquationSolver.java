public class EquationSolver {
    public static SquareEqual squareEqual;

    public EquationSolver(SquareEqual squareEqual) {
        this.squareEqual = new SquareEqual(squareEqual.getA(), squareEqual.getB(), squareEqual.getC());
    }

    public double MaxR() {
        Double[] mass = squareEqual.solution();
        if (mass[0] == null && mass[1] == null) {
            throw new ArithmeticException("нет решений!");
        }

        if (mass[1] == null) return mass[0];

        if (mass[0] == Double.POSITIVE_INFINITY || mass[1] == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("INF");
        }
        return Math.max(mass[0], mass[1]);
    }
}
