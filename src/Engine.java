public class Engine implements EngineCompound {
    int size,
        power,
        maxVelocity,
        hyperJumpLength,
        price,
        durability;
    Manufacturer manufacturer;

    public Engine() {}

    public Engine setProperties(int size, int power, int maxVelocity, int hyperJumpLength, int price, int durability, Manufacturer manufacturer) {
        this.size = size;
        this.power = power;
        this.maxVelocity = maxVelocity;
        this.hyperJumpLength = hyperJumpLength;
        this.price = price;
        this.durability = durability;
        this.manufacturer = manufacturer;
        return this;
    }

    public Engine(Engine other) {
        this.size = other.size;
        this.power = other.power;
        this.maxVelocity = other.maxVelocity;
        this.hyperJumpLength = other.hyperJumpLength;
        this.price = other.price;
        this.durability = other.durability;
        this.manufacturer = other.manufacturer;
    }

    public Engine copy() {
        return new Engine(this);
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
