package Astar;

public class Noeud implements Comparable{
    private int x, y;
    private int heuristique;

    public Noeud(int x, int y, int h) {
        this.x = x;
        this.y = y;
        this.heuristique = h;
    }

    public int getHeuristique() {
        return heuristique;
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
