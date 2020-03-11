package calculSalaire;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie s1 = new Salarie("Priou","Dylan", 2048);
        System.out.println(s1.getSalaire());
        Pigiste p1 = new Pigiste("Legeay","Alexis",220,5);
        System.out.println(p1.getSalaire());
        s1.afficheDonnee();
        p1.afficheDonnee();
    }
}
