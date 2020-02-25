package com.company;

public abstract class obstacle {

    protected int weight;
    protected boolean bonus;
    protected position pos;

    public obstacle (boolean b, position p, int w) {
        bonus = b;
        pos = p;
        weight = w;
    }

    public abstract double oSpeed();
    public abstract double oArea();






}
