public abstract class TankModule extends Tank {
    protected Manufacturer manufacturer;
    protected Tank inner;

    public TankModule(Tank inner, Manufacturer manufacturer) {
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

    public Tank setFuel(int fuel) {
        inner.setFuel(fuel);
        return this;
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
