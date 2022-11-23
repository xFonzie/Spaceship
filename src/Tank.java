public class Tank extends TankCompound {
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

    public Tank copy() {
        return new Tank(this);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPrice() {
        return this.price;
    }

    public int getFuelQuality() {
        return this.fuelQuality;
    }

    public int getDurability() {
        return this.durability;
    }

    @Override
    boolean isBaseTank() {
        return true;
    }

    public TankCompound addModule(TankCompound module) {
        module.inner = this;
        return module;
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
