public class TankFactory extends PartFactory {

    @Override
    public Tank createPart() {
        return new Tank();
    }

    public Tank addAddUpgrade(Tank tank, Manufacturer manufacturer) {
        return new TankAddUpgrade(tank, manufacturer);
    }

    public Tank addMultUpgrade(Tank tank, Manufacturer manufacturer) {
        return new TankMultUpgrade(tank, manufacturer);
    }
}
