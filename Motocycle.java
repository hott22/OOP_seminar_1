package sem01;

import java.util.Random;

public class Motocycle extends  Transport{
    static {
        Motocycle.r = new Random();
    }
    public Motocycle(String color, String model, int speed) {
        super(color, model, 2, Motocycle.r.nextInt(100, 150), speed);
    }
}

