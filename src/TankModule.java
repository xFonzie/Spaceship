public abstract class TankModule implements TankCompound {
    protected Manufacturer manufacturer;
    protected TankCompound inner;

    public TankModule(TankCompound inner, Manufacturer manufacturer) {
        this.inner = inner;
        this.manufacturer = manufacturer;
    }

    public int getDurability() {
        return inner.getDurability();
    }

    public int getSize() {
        return inner.getSize();
    }

    public int getPrice() {
        return inner.getPrice();
    }

    public int getCapacity() {
        return inner.getCapacity();
    }

    public int getFuelQuality() {
        return inner.getFuelQuality();
    }

    public int getFuelLevel() {
        return inner.getFuelLevel();
    }

    public TankCompound setFuel(int fuel) {
        return inner.setFuel(fuel);
    }

    public TankCompound useFuel(int fuel) {
        return inner.useFuel(fuel);
    }

    public int numberOfModules() {
        return 1 + inner.numberOfModules();
    }

    public String getProperties() {
        return this.toString();
    }

    public abstract TankModule copy();

    public abstract String toString();
}
