public class EngineFactory {
    public Engine createPart(int size, int power, int maxVelocity, int hyperJumpLength, int price, int durability, Manufacturer manufacturer) {
        return new Engine(size, power, maxVelocity, hyperJumpLength, price, durability, manufacturer);
    }

    public EngineCompound addJumper(EngineCompound engine, Manufacturer manufacturer) {
        return new EngineJumper(engine, manufacturer);
    }

    public EngineCompound addPowerer(EngineCompound engine, Manufacturer manufacturer) {
        return new EnginePowerer(engine, manufacturer);
    }
}
