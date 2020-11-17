package com.company;

public class Agent {
    private Environnement e;
    private int posX, posY;
    private boolean directionLibre;

    public Agent(Environnement e, int posX, int posY) {
        this.e = e;
        this.posX = posX;
        this.posY = posY;
    }
}
