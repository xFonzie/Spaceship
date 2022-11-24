public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank().setProperties(1, 100, 100, 100, 100, Manufacturer.A);
        tank = new TankMultUpgrade(tank, Manufacturer.B);
        tank = new TankAddUpgrade(tank, Manufacturer.C);


        tank.setFuel(210);
        System.out.println(tank.getFuelLevel());
        System.out.println(tank.getCapacity());
    }
}