package Calculate;

public class ArithmeticCalculator {
    private double a;
    private double b;

    public ArithmeticCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operation operation) {
        switch (operation) {
            case ADD:
                System.out.println(a + b);
                break;
            case SUBTRACT:
                System.out.println(a - b);
                break;
            case MULTIPLY:
                System.out.println(a * b);
                break;
        }
    }
}
