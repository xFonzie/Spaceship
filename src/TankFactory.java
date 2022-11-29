public class TankFactory extends PartFactory {

    @Override
    public Tank createPart() {
        return new Tank();
    }

    public TankCompound addAddUpgrade(TankCompound tank, Manufacturer manufacturer) {
        return new TankAddUpgrade(tank, manufacturer);
    }

    public TankCompound addMultUpgrade(TankCompound tank, Manufacturer manufacturer) {
        return new TankMultUpgrade(tank, manufacturer);
    }
}
