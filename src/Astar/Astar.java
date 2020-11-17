package Astar;

import com.company.Agent;
import com.company.Environnement;

import java.util.*;

public class Astar {
    private Environnement e;

    private Agent a;

//    public int compare2Noeuds(Noeud n1, Noeud n2){
//        if(n1.getHeuristique() < n2.getHeuristique()){
//            return 1;
//        }else if(n1.getHeuristique() == n2.getHeuristique()){
//            return 0;
//        }else{
//            return -1;
//        }
//    }

    public void cheminPlusCourt(Environnement e, Agent a){
        Noeud objectif = new Noeud(a.getPositionFinal(), 0);
        Queue<Noeud> closedList = new LinkedList<>();
        SortedSet<Noeud> openList = new TreeSet<>();
        openList.add(new Noeud(a.getPositionIni(), objectif));
        Noeud u;

        while (!openList.isEmpty()){
            u = openList.first();
            if(u.compareTo(objectif) == 0){
                reconstituerChemin(u);
                return;
            }

        }
    }

    public void reconstituerChemin(Noeud n){

    }


    public List<Noeud> getVoisins(Environnement e, Noeud n){


        return new ArrayList<>();
    }

}
