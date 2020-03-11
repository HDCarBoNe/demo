package classe;


import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenu dans le Game !!!");
        System.out.println("Comment souhaitez-vous nommé votre game ?");
        String label = sc.nextLine();
        System.out.println("Entrez J1: ");
        String j1 = sc.nextLine();
        System.out.println("Entrez J2: ");
        String j2 = sc.nextLine();
        System.out.println("En combien de tours souhaitez-vous réaliser la partie: ");
        int nbTours = sc.nextInt();
        //shoot le buffer
        sc.nextLine();
        Partie p = new Partie(new Personne(j1),new Personne(j2),label,nbTours);
        p.start();
        System.out.println("Le gagnant est "+p.getWinner().getNom());
    }
}
