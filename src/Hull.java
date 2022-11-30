public class Hull implements Part {
    private int weight,
                capacity,
                engineMaxSize,
                tankMaxSize,
                price;
    Colour colour;
    Manufacturer manufacturer;

    public Hull (int weight, int capacity, int engineMaxSize, int tankMaxSize, int price, Colour colour, Manufacturer manufacturer) {
        this.weight = weight;
        this.capacity = capacity;
        this.engineMaxSize = engineMaxSize;
        this.tankMaxSize = tankMaxSize;
        this.price = price;
        this.colour = colour;
        this.manufacturer = manufacturer;
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

    public int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getEngineMaxSize() {
        return engineMaxSize;
    }

    protected void setEngineMaxSize(int engineMaxSize) {
        this.engineMaxSize = engineMaxSize;
    }

    public int getTankMaxSize() {
        return tankMaxSize;
    }

    protected void setTankMaxSize(int tankMaxSize) {
        this.tankMaxSize = tankMaxSize;
    }

    public int getPrice() {
        return price;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    public String getProperties() {
        return this.toString();
    }

    public int numberOfModules() {
        return 1;
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
