package Computer.screen;

public class Screen {
    private double diagonal;
    private ScreenType type;
    private int weight;

    public Screen(double diagonal, int weight, ScreenType type) {
        this.diagonal = diagonal;
        this.weight = weight;
        this.type = type;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public ScreenType getType() {
        return type;
    }

    public void setType(ScreenType type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "diagonal=" + diagonal +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }
}
