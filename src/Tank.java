public class Tank implements TankCompound {
    private int size,
                capacity,
                price,
                durability,
                fuelQuality,
                fuelLevel;
    private Manufacturer manufacturer;

    public Tank() {}

    public Tank setProperties(int size, int capacity, int price, int durability, int fuelQuality, Manufacturer manufacturer) {
        this.size = size;
        this.capacity = capacity;
        this.price = price;
        this.durability = durability;
        this.fuelQuality = fuelQuality;
        this.manufacturer = manufacturer;
        return this;
    }

    public Tank(Tank other) {
        this.size = other.size;
        this.capacity = other.capacity;
        this.price = other.price;
        this.durability = other.durability;
        this.fuelQuality = other.fuelQuality;
        this.fuelLevel = other.fuelLevel;
        this.manufacturer = other.manufacturer;
    }

    public Tank copy() {
        return new Tank(this);
    }

    public Tank setFuel(int fuelLevel) {
        if (fuelLevel > this.getCapacity()) {
            throw new IllegalArgumentException("Fuel level cannot be greater than capacity");
        }
        this.fuelLevel = fuelLevel;
        return this;
    }

    public Tank fillTank() {
        this.setFuel(this.getCapacity());
        return this;
    }

    public Tank useFuel(int fuel){
        if (fuelLevel - fuel < 0) {
            throw new IllegalArgumentException("Not enough fuel");
        }

        fuelLevel -= fuel;
        return this;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPrice() {
        return this.price;
    }

    public int getDurability() {
        return this.durability;
    }

    public int getFuelQuality() {
        return this.fuelQuality;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }


    public int numberOfModules() {
        return 1;
    }

    public String getProperties() {
        return this.toString();
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
