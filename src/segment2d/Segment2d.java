package segment2d;

import java.awt.*;

public class Segment2d {
    Point p1;
    Point p2;

    public Segment2d(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
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

    public String toString(){
        String str = "Segment["+(int)p1.getX()+","+(int)p1.getY()+"]["+(int)p2.getX()+","+(int)p2.getY()+"]";
        return str;
    }

    public double coefDir(){
        double a = (p2.getY()-p1.getY())/(p2.getX()-p2.getY());
        return a;
    }

    public double lenght(){
        int x = (int)p2.getX() - (int)p1.getX();
        double x2= Math.pow(2,x);
        int y = (int)p2.getY()-(int)p1.getY();
        double y2 = Math.pow(2,y);
        double lenght = Math.sqrt(x2 + y2);
        return lenght;
    }

    public boolean appartient(Point p3){
        // f(x) = ax + b ou a = coefficient directeur de la droite
        if(p3.getY() == p3.getX()*coefDir()+1){
            return true;
        }
        return false;
    }
}
