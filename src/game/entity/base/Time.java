package game.entity.base;

public class Time {

    public static double time = System.nanoTime();

    public static double getTime() {
        return ((System.nanoTime() - time) * 1E-9);
    }

}
