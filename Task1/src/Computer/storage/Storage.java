package Computer.storage;

public class Storage {
    private StorageType type;
    private int size;
    private int weight;
    public Storage(StorageType type, int size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public StorageType getType() {
        return type;
    }

    public void setType(StorageType type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "type=" + type +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}
