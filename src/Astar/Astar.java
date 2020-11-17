package Astar;

import com.company.Agent;
import com.company.Environnement;

import java.util.LinkedList;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;

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
        Queue<Noeud> closedList = new LinkedList<>();
        SortedSet<Noeud> openList = new TreeSet<>();
    }


}
