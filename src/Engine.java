public class Engine extends EngineCompound implements Part{
    int size,
        power,
        maxVelocity,
        hyperJumpLength,
        price,
        durability;

    public Engine setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public Engine() {}
    public Engine setProperties(int size, int power, int maxVelocity, int hyperJumpLength, int price, int durability) {
        this.size = size;
        this.power = power;
        this.maxVelocity = maxVelocity;
        this.hyperJumpLength = hyperJumpLength;
        this.price = price;
        this.durability = durability;
        return this;
    }

    public Engine(Engine other) {
        this.size = other.size;
        this.power = other.power;
        this.maxVelocity = other.maxVelocity;
        this.hyperJumpLength = other.hyperJumpLength;
        this.price = other.price;
        this.durability = other.durability;
    }

    public Engine copy() {
        return new Engine(this);
    }

    public ConcreteEngineModule addModule(ConcreteEngineModule module) {
        module.inner = this;
        return module;
    }

    public int getVelocity() {
        return this.maxVelocity;
    }

    public int getPrice() {
        return this.price;
    }

    public int getHyperJumpLength() {
        return this.hyperJumpLength;
    }

    public int getPower() {
        return this.power;
    }

    public int getSize() {
        return this.size;
    }

    public int getDurability() {
        return this.durability;
    }

    public int numberOfModules() {
        return 1;
    }

    public boolean isBaseEngine() {
        return true;
    }

    public String getProperties() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Engine{" +
                "size=" + size +
                ", power=" + power +
                ", maxVelocity=" + maxVelocity +
                ", hyperJumpLength=" + hyperJumpLength +
                ", price=" + price +
                ", durability=" + durability +
                '}';
    }
}
