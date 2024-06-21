package Computer.cpu;

public class Cpu {
    private Frequency frequency;
    private CoreCount coreCount;
    private Creator creator;
    private int weight;
    public Cpu(Frequency frequency, CoreCount coreCount, Creator creator, int weight) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.creator = creator;
        this.weight = weight;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public CoreCount getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(CoreCount coreCount) {
        this.coreCount = coreCount;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "frequency=" + frequency +
                ", coreCount=" + coreCount +
                ", creator=" + creator +
                ", weight=" + weight +
                '}';
    }
}
