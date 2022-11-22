public class Body {
    int weight,
        capacity,
        engineMaxSize,
        tankMaxSize,
        price;
    Colour colour;

    public Body(int weight, int capacity, int engineMaxSize, int tankMaxSize, int price, Colour colour) {
        this.weight = weight;
        this.capacity = capacity;
        this.engineMaxSize = engineMaxSize;
        this.tankMaxSize = tankMaxSize;
        this.price = price;
        this.colour = colour;
    }

    public Body(Body other) {
        this.weight = other.weight;
        this.capacity = other.capacity;
        this.engineMaxSize = other.engineMaxSize;
        this.tankMaxSize = other.tankMaxSize;
        this.price = other.price;
        this.colour = other.colour;
    }

    public Body copy() {
        return new Body(this);
    }

    @Override
    public String toString() {
        return "Body{" +
                "weight=" + weight +
                ", capacity=" + capacity +
                ", engineMaxSize=" + engineMaxSize +
                ", tankMaxSize=" + tankMaxSize +
                ", price=" + price +
                ", colour=" + colour +
                '}';
    }
}
