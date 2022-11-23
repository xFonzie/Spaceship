public abstract class EngineCompound {
    EngineCompound inner;

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
    abstract EngineCompound copy();

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
