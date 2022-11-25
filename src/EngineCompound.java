public interface EngineCompound extends Part {
    int getSize();
    int getPower();
    int getVelocity();
    int getHyperJumpLength();
    int getPrice();
    int getDurability();

    EngineCompound copy();
}
