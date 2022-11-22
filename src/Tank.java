public class Tank {
    int size;
    int capacity;
    int price;
    int durability;
    int fuelQuality;

    public Tank(int size, int capacity, int price, int durability, int fuelQuality) {
        this.size = size;
        this.capacity = capacity;
        this.price = price;
        this.durability = durability;
        this.fuelQuality = fuelQuality;
    }

    public Tank(Tank other) {
        this.size = other.size;
        this.capacity = other.capacity;
        this.price = other.price;
        this.durability = other.durability;
        this.fuelQuality = other.fuelQuality;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "size=" + size +
                ", capacity=" + capacity +
                ", price=" + price +
                ", durability=" + durability +
                ", fuelQuality=" + fuelQuality +
                '}';
    }
}
