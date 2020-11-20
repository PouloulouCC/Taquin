package com.company;

import java.util.List;
import java.util.Queue;

public class Agent {
    private Environnement e;


    private Position positionIni, positionFinal;
    private boolean caseLibre;
    private Queue<Message> boiteAuxLettres;


    public Agent(Environnement e, Position positionIni, Position positionFinal) {
        this.e = e;
        this.positionIni = positionIni;
        this.positionFinal = positionFinal;
    }

    /*
    Après avoir trouver la case grâce à raisonner ET après avoir vérifier si la case est libre,
    on se déplace vers la case choisie
    */
    public void seDeplacer(){


    }

    //Observe l'environnement (en haut, à droite, à gauche,
    public void Observer(){

    }

    //TODO LOUIS AVEC A*
    // Utilisation de A* pour savoir quel est le meilleur chemin pour aller à la position final
    public void Raisonner(){

    }

    public void Decider(){

    }

    public void Appliquer(){

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

    public boolean getCaseLibre() {
        return caseLibre;
    }

    public void setDirectionLibre(boolean caseLibre) {
        this.caseLibre = caseLibre;
    }

    //Vérifie si y'a un agent ou pas sur la position voulue
    public boolean isCaseLibre(Environnement e,Position p){
        Agent a = null;
        //Récupère si y'a un agent à la position p
        a = e.getContent(p);

        if (a == null){
            //La case est libre
            return true;
        }else{
            //La case est occupée
            return false;
        }
    }

    public Queue<Message> getBoiteAuxLettres() {
        return boiteAuxLettres;
    }

    public void setBoiteAuxLettres(Queue<Message> boiteAuxLettres) {
        this.boiteAuxLettres = boiteAuxLettres;
    }
}
