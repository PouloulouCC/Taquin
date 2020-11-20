package com.company;

import java.util.List;
import java.util.Queue;

public class Agent {
    private Environnement e;


    private Position positionIni, positionFinal;
    private boolean directionLibre;
    private Queue<Message> boiteAuxLettres;


    public Agent(Environnement e, Position positionIni, Position positionFinal) {
        this.e = e;
        this.positionIni = positionIni;
        this.positionFinal = positionFinal;
    }

    //TODO LOUIS AVEC A*
    public void seDeplacer(){

    }

    public Position getPositionIni() {
        return positionIni;
    }

    public void setPositionIni(Position positionIni) {
        this.positionIni = positionIni;
    }

    public Position getPositionFinal() {
        return positionFinal;
    }

    public void setPositionFinal(Position positionFinal) {
        this.positionFinal = positionFinal;
    }

    public boolean isDirectionLibre() {
        return directionLibre;
    }

    public void setDirectionLibre(boolean directionLibre) {
        this.directionLibre = directionLibre;
    }

    public Queue<Message> getBoiteAuxLettres() {
        return boiteAuxLettres;
    }

    public void setBoiteAuxLettres(Queue<Message> boiteAuxLettres) {
        this.boiteAuxLettres = boiteAuxLettres;
    }
}
