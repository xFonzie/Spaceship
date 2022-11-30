public class TankFactory {

    public Tank createPart(int size, int capacity, int price, int durability, int fuelQuality, Manufacturer manufacturer) {
        return new Tank(size, capacity, price, durability, fuelQuality, manufacturer);
    }

    public TankCompound addAddUpgrade(TankCompound tank, Manufacturer manufacturer) {
        return new TankAddUpgrade(tank, manufacturer);
    }

    public TankCompound addMultUpgrade(TankCompound tank, Manufacturer manufacturer) {
        return new TankMultUpgrade(tank, manufacturer);
    }
}
