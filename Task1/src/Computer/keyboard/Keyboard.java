package Computer.keyboard;

public class Keyboard {
    private KeyboardType type;
    private Backlighting backlighting;
    private int weight;
    public Keyboard(KeyboardType type, Backlighting backlighting, int weight) {
        this.type = type;
        this.backlighting = backlighting;
        this.weight = weight;
    }

    public KeyboardType getType() {
        return type;
    }

    public void setType(KeyboardType type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Backlighting getBacklighting() {
        return backlighting;
    }

    public void setBacklighting(Backlighting backlighting) {
        this.backlighting = backlighting;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "type=" + type +
                ", backlighting=" + backlighting +
                ", weight=" + weight +
                '}';
    }
}
