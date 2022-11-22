public class Engine {
    int size,
        power,
        maxVelocity,
        hyperJumpLength,
        price,
        durability;

    public Engine(int size, int power, int maxVelocity, int hyperJumpLength, int price, int durability) {
        this.size = size;
        this.power = power;
        this.maxVelocity = maxVelocity;
        this.hyperJumpLength = hyperJumpLength;
        this.price = price;
        this.durability = durability;
    }

    public Engine(Engine other) {
        this.size = other.size;
        this.power = other.power;
        this.maxVelocity = other.maxVelocity;
        this.hyperJumpLength = other.hyperJumpLength;
        this.price = other.price;
        this.durability = other.durability;
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
