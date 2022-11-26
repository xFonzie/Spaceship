public interface TankCompound extends Part {
    int getSize();
    int getCapacity();
    int getPrice();
    int getDurability();
    int getFuelQuality();
    int getFuelLevel();

    TankCompound copy();
    TankCompound setFuel(int fuel);
    TankCompound useFuel(int fuel);
}
