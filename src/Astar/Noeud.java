package Astar;

import java.util.Map;

public class Noeud implements Comparable{
    private int x, y;
    private int heuristique;

    public Noeud(int x, int y, int h) {
        this.x = x;
        this.y = y;
        this.heuristique = h;
    }

    public Noeud(int x, int y, Noeud n){
        this.x = x;
        this.y = y;
        heuristique = calcHeuristique(n);
    }

    public int calcHeuristique(Noeud n){
        return Math.abs(x - n.getX()) + Math.abs(y - n.getY());
    }

    public int getHeuristique() {
        return heuristique;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Object o) {
        Noeud n = (Noeud)o;
        if(this.getHeuristique() < n.getHeuristique()){
            return 1;
        }else if(this.getHeuristique() == n.getHeuristique()){
            return 0;
        }else{
            return -1;
        }
    }
}
