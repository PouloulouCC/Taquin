package Astar;

import com.company.Position;

import java.util.Map;

public class Noeud implements Comparable{
    private int x, y;
    private int heuristique;

    public Noeud(Position p, int h) {
        this.x = p.getX();
        this.y = p.getY();
        this.heuristique = h;
    }

    public Noeud(Position p, Noeud n){
        this.x = p.getX();
        this.y = p.getY();
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
