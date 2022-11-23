public class EngineCompound implements Module {
    EngineCompound inner;
    Manufacturer manufacturer;

    public EngineCompound setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    int getVelocity() {
        if (inner == null)
            return 0;
        return inner.getVelocity();
    }

    int getPrice() {
        if (inner == null)
            return 0;
        return inner.getPrice();
    }

    int getHyperJumpLength() {
        if (inner == null)
            return 0;
        return inner.getHyperJumpLength();
    }

    int getPower() {
        if (inner == null)
            return 0;
        return inner.getPower();
    }

    int getSize() {
        if (inner == null)
            return 0;
        return inner.getSize();
    }

    int getDurability() {
        if (inner == null)
            return 0;
        return inner.getDurability();
    }

    int numberOfModules() {
        if (inner == null)
            return 1;
        return inner.numberOfModules() + 1;
    }

    boolean isBaseEngine() {
        return false;
    }

    EngineCompound addModule(EngineCompound module) {
        if (module.isBaseEngine())
            throw new IllegalArgumentException("Cannot add a base engine to another engine");
        module.inner = this;
        return module;
    }

    /** Copy function with return value in such structure: inner.copy().addModule(new *name of the class*)*/
    public EngineCompound copy() {
        return inner.copy().addModule(new EngineCompound());
    }

    public String getProperties() {
        return this.toString();
    }

    public String toString() {
        return "Engine{" +
                "size=" + getSize() +
                ", power=" + getPower() +
                ", maxVelocity=" + getVelocity() +
                ", hyperJumpLength=" + getHyperJumpLength() +
                ", price=" + getPrice() +
                ", durability=" + getDurability() +
                ", numberOfModules=" + numberOfModules() +
                '}';
    }
}
