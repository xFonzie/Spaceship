public class TankCompound implements Module {
    TankCompound inner;
    Manufacturer manufacturer;

    public TankCompound setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /** Copy function with return value in such structure: inner.copy().addModule(new *name of the class*)*/
    public TankCompound copy() {
        return inner.copy().addModule(new TankCompound());
    }

    public TankCompound getInner() {
        return inner;
    }

    int getCapacity() {
        if (inner == null)
            return 0;
        return inner.getCapacity();
    }

    int getPrice() {
        if (inner == null)
            return 0;
        return inner.getPrice();
    }

    int getFuelQuality() {
        if (inner == null)
            return 0;
        return inner.getFuelQuality();
    }

    int getDurability() {
        if (inner == null)
            return 0;
        return inner.getDurability();
    }

    int getSize() {
        if (inner == null)
            return 0;
        return inner.getSize();
    }

    int numberOfModules() {
        if (inner == null)
            return 1;
        return inner.numberOfModules() + 1;
    }

    boolean isBaseTank() {
        return false;
    }

    TankCompound addModule(TankCompound module) {
        if (module.isBaseTank())
            throw new IllegalArgumentException("Cannot add a base tank to another tank");

        module.inner = this;
        return module;
    }

    public String getProperties() {
        return this.toString();
    }

    public String toString() {
        return "TankCompound{" +
                "size=" + getSize() +
                ", capacity=" + getCapacity() +
                ", price=" + getPrice() +
                ", durability=" + getDurability() +
                ", fuelQuality=" + getFuelQuality() +
                ", numberOfModules=" + numberOfModules() +
                '}';
    }

    public TankCompound fillTank() {
        if (inner == null)
            return this;
        inner.fillTank();
        return this;
    }

    public int getFuelLevel() {
        if (inner == null)
            return 0;
        return inner.getFuelLevel();
    }

    public TankCompound useFuel(int i) {
        if (inner == null)
            return this;
        inner.useFuel(i);
        return this;
    }
}
