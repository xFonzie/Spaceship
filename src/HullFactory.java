public class HullFactory {
    public Hull createPart(int weight, int capacity, int engineMaxSize, int tankMaxSize, int price, Colour colour, Manufacturer manufacturer) {
        return new Hull(weight, capacity, engineMaxSize, tankMaxSize, price, colour, manufacturer);
    }
}
