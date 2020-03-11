package segment2d;

import java.awt.*;

public class App {

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(7, 9);
        Segment2d s1 = new Segment2d(p1,p2);
        System.out.println(s1.toString());
        System.out.println(s1.lenght());
        Point p3 = new Point(1,2 );

    }
}
