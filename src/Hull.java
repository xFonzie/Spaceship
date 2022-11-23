public class Hull implements Part{
    protected int weight,
            capacity,
            engineMaxSize,
            tankMaxSize,
            price;
    Colour colour;
    Manufacturer manufacturer;

    public Hull setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public Hull() {}

    public Hull setProperties(int weight, int capacity, int engineMaxSize, int tankMaxSize, int price, Colour colour) {
        this.weight = weight;
        this.capacity = capacity;
        this.engineMaxSize = engineMaxSize;
        this.tankMaxSize = tankMaxSize;
        this.price = price;
        this.colour = colour;
        return this;
    }

    public Hull(Hull other) {
        this.weight = other.weight;
        this.capacity = other.capacity;
        this.engineMaxSize = other.engineMaxSize;
        this.tankMaxSize = other.tankMaxSize;
        this.price = other.price;
        this.colour = other.colour;
        this.manufacturer = other.manufacturer;
    }

    public Hull copy() {
        return new Hull(this);
    }

    public String getProperties() {
        return this.toString();
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

    public void setColor(Colour colour) {
        this.colour = colour;
    }
}
