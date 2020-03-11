package segment.bo;


import segment.exception.NotBelongToException;

public class App {

    public static void doSomething() throws NotBelongToException {
        Point p1 = new Point(24);
        Point p2 = new Point(17);
        Segment p12 = new Segment(p1,p2);
        System.out.println(p12.toString());
        System.out.println(p12.getLongueur());
        if (p12.appartient(15)){
            System.out.println("oui, 15 appartient au segment");
        }

        p1.setCoorX(5);
        p2.setCoorX(9);
        p12.setP1(p1);
        p12.setP2(p2);
        System.out.println(p12.toString());
        System.out.println(p12.getLongueur());
    }

    public static void main(String[] args) {
        try {
            doSomething();
        }catch ( NotBelongToException e){
            System.out.println("Erreur: "+e.getMessage());
        }

    }
}
