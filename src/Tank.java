public class Tank extends TankCompound implements Part{
    int size;
    int capacity;
    int price;
    int durability;
    int fuelQuality;
    int fuelLevel;

    public Tank setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public Tank() {}

    public Tank setProperties(int size, int capacity, int price, int durability, int fuelQuality) {
        this.size = size;
        this.capacity = capacity;
        this.price = price;
        this.durability = durability;
        this.fuelQuality = fuelQuality;
        return this;
    }

    public Tank(Tank other) {
        this.size = other.size;
        this.capacity = other.capacity;
        this.price = other.price;
        this.durability = other.durability;
        this.fuelQuality = other.fuelQuality;
        this.fuelLevel = other.fuelLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public Tank setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
        return this;
    }

    public Tank fillTank() {
        this.fuelLevel = this.capacity;
        return this;
    }

    public Tank useFuel(int fuel){
        if (fuelLevel - fuel < 0) {
            throw new IllegalArgumentException("Not enough fuel");
        }

        fuelLevel -= fuel;
        return this;
    }

    @Override
    public Tank copy() {
        return new Tank(this);
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getFuelQuality() {
        return this.fuelQuality;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    int getSize() {
        return this.size;
    }

    @Override
    boolean isBaseTank() {
        return true;
    }

    public TankCompound addModule(TankCompound module) {
        module.inner = this;
        return module;
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
