public class Main {
    public static void main(String[] args) {
        SpaceshipBuilder s = new SpaceshipBuilder();
        Tank t = new Tank(1, 1, 1, 1, 1);
        Body b = new Body(1, 1, 1, 1, 1, Colour.RED);
        Engine e = new Engine(1, 1, 1, 1, 1, 1);

        s.setBody(b).setTank(t).setEngine(e);
        try {
            Spaceship s1 = s.getSpaceship();
            t.size = 2;
            s.setTank(t);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
