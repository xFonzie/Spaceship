public class MyExceptions {
    public static class HyperJumpError extends Exception{
        HyperJumpError(String message) {
            super(message);
        }
    }

    public static class SpaceshipNotReady extends Exception{
        SpaceshipNotReady(String message) {
            super(message);
        }
    }
}
