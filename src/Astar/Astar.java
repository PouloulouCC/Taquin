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
        objectif = new Noeud(a.getPositionFinal(), 0, 0);

        Queue<Noeud> closedList = new LinkedList<>();
        SortedSet<Noeud> openList = new TreeSet<>();
        openList.add(new Noeud(a.getPositionIni(), objectif, 0));
        Noeud u;

        while (!openList.isEmpty()){
            u = openList.first();
            if(u.compareTo(objectif) == 0){
                reconstituerChemin(u);
                return;
            }
            for(Noeud v : getVoisins(u)){
                if(v != null){
                    if(!(closedList.contains(v) || existInWithLowerCost(openList, v))){
                        v.setCout(u.getCout() + 1);
                        v.setHeuristique(v.getCout() + v.calcDistance(objectif));
                        openList.add(v);
                        v.setParent(u);
                    }
                }
            }
            closedList.add(u);

        }
    }

    public Noeud reconstituerChemin(Noeud n){
        Noeud suivant = n;
        while(n.getParent() != null){
            suivant = n;
            n = n.getParent();
        }
        return suivant;
    }

    public boolean existInWithLowerCost(SortedSet<Noeud> openList, Noeud n){
        if(openList.contains(n)){
            for(Noeud row : openList){
                if(row.equals(n)){
                    if(row.getCout() < n.getCout()){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public List<Noeud> getVoisins(Noeud n){
        List<Noeud> voisins = new ArrayList<>();
        voisins.add(getVoisin(new Position(n.getX()+1, n.getY()), n.getCout()));
        voisins.add(getVoisin(new Position(n.getX()-1, n.getY()), n.getCout()));
        voisins.add(getVoisin(new Position(n.getX(), n.getY()+1), n.getCout()));
        voisins.add(getVoisin(new Position(n.getX(), n.getY()-1), n.getCout()));

        return new ArrayList<>();
    }

    public Noeud getVoisin(Position p, int cout) {
        if(p.getX() < 0 || p.getX() >= e.getN() || p.getY() < 0 || p.getY() >= e.getN()){
            return null;
        }
        if(e.getContent(p) == null){
            return new Noeud(p, objectif, cout);
        }
        return null;
    }

}
