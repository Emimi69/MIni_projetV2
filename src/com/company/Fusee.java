package com.company;

public class Fusee extends Transporteur {

    protected int tank;
    protected int fWeight;
    protected double thrust;
    protected double fSpeed;
    protected position fPos;

    public Fusee() {
        tank = 100;
        fWeight = 500000;
        thrust = 600000;
        fSpeed = 0;
        fPos = new position(750, 300);
    }

    /*public double acceleration() {
        return (Math.sqrt((thrust - weight) * (1/weight)));
    }*/

    public double speed() {
        return(100);
    }

    public void changeSpeed() {
        this.fSpeed = speed();
    }

    public position move(position pos, int dx, int dy) {
        int nx = pos.getpX() + dx;
        int ny = pos.getpY() + dy;
        position nPos = new position(nx , ny);
        return(nPos);
    }


}

