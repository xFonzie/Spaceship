public class Main {
    public static void main(String[] args) {
        AlienSpaceshipBuilder s = new AlienSpaceshipBuilder();
        Tank t = new Tank(1, 1, 1, 1, 1);
        Body b = new Body(1, 1, 1, 1, 1, Colour.RED);
        Engine e = new Engine(1, 100, 1, 1, 1, 1);

        s.setBody(b).setEngine(e).setTank(t);
        try {
            Spaceship s1 = s.getSpaceship();
            t.size = 2;
            s.setTank(t);
            Spaceship s2 = s.getSpaceship();
            System.out.println(s.report());
            System.out.println("" + s1.tank.size + " " + s2.tank.size);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
