package com.company;

public class meteorite extends obstacle {

    protected double radius;

    public meteorite(boolean b, position p, int w) {
        super(b, p, w);
        radius = 100;
    }


    @Override
    public double oSpeed() {
        return 100;
    }

    @Override
    public double oArea() {
        return (Math.PI*radius*radius);
    }
}
