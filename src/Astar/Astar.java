package Astar;

import com.company.Agent;
import com.company.Environnement;
import com.company.Position;

import java.util.*;

public class Astar {
    private Environnement e;
    private Noeud objectif;

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
        this.e = e;
        objectif = new Noeud(a.getPositionFinal(), 0);

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
            for(Noeud n : getVoisins(u)){
                if(n != null){
                    if(!closedList.contains(n) || )
                }
            }

        }
    }

    public void reconstituerChemin(Noeud n){

    }

    public boolean existInWithLowerCost(SortedSet<Noeud> openList, Noeud n){
        if(openList.contains(n)){

        }
        return true;
    }

    public List<Noeud> getVoisins(Noeud n){
        List<Noeud> voisins = new ArrayList<>();
        voisins.add(getVoisin(new Position(n.getX()+1, n.getY())));
        voisins.add(getVoisin(new Position(n.getX()-1, n.getY()));
        voisins.add(getVoisin(new Position(n.getX(), n.getY()+1));
        voisins.add(getVoisin(new Position(n.getX(), n.getY()-1));

        return new ArrayList<>();
    }

    public Noeud getVoisin(Position p) {
        if(p.getX() < 0 || p.getX() >= e.getN() || p.getY() < 0 || p.getY() >= e.getN()){
            return null;
        }
        if(e.getContent(p) == null){
            return new Noeud(p, objectif);
        }
        return null;
    }

}
