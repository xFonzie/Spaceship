public class TankMultUpgrade extends TankModule{

    public TankMultUpgrade(Tank wrappee, Manufacturer manufacturer) {
        super(wrappee, manufacturer);
    }

    @Override
    public int getPrice() {
        int price = 10;

        return inner.getPrice() + price;
    }

    public int getCapacity() {
        return (int) (inner.getCapacity() * 1.1);
    }

    @Override
    public String toString() {
        return "ConcTankModule1{" +
                "manufacturer=" + manufacturer +
                ", wrappee=" + inner +
                '}';
    }
}
