package segment.bo;

import segment.exception.NotBelongToException;

public class Segment {
    Point p1;
    Point p2;

    public Segment(Point pP1, Point pP2){
        p1 = pP1;
        p2 = pP2;
        this.ordonne();
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void ordonne(){
        if (p1.getCoorX() > p2.getCoorX()){
            int cordTemp= p1.getCoorX();
            p1.setCoorX(p2.getCoorX());
            p2.setCoorX(cordTemp);
        }
    }

    public int getLongueur(){
        int lenght = p2.getCoorX() - p1.getCoorX();
        return lenght;
    }

    public boolean appartient(int x) throws NotBelongToException {
        if (x < p1.getCoorX() ||  x > p2.getCoorX()) throw new NotBelongToException(this,x);
        return true;
    }

    @Override
    public String toString(){
        String str = "Segment["+p1.getCoorX()+","+p2.getCoorX()+"]";
        return str;
    }
}
