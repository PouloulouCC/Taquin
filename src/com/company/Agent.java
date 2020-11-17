package com.company;

import java.util.List;
import java.util.Queue;

public class Agent {
    private Environnement e;
    private int posX, posY;
    private boolean directionLibre;
    private int posXFinal, posYFinal;
    private Queue<Message> boiteAuxLettres;


    public Agent(Environnement e, int posX, int posY, int posXFinal, int posYFinal) {
        this.e = e;
        this.posX = posX;
        this.posY = posY;
        this.posXFinal = posXFinal;
        this.posYFinal = posYFinal;
    }


}
