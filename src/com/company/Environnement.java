package com.company;

import java.util.List;

public class Environnement {
    private Agent[][] plateau;
    private int n;
    private int nbAgents;
    private List<Agent> listeAgents;

    public Environnement(int n, int nbAgents){
        this.n = n;
        this.nbAgents = nbAgents;
    }

}
