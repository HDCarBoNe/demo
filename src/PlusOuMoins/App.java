package PlusOuMoins;

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue au jeu du + ou moins");
        System.out.println("Entrez le nombre maximum");
        int nbr = RandomGen.generate(sc.nextInt());
        plusoumoins(nbr);
    }

    public static void plusoumoins(int nbr){
        int enter = -1;
        int nbr_essaie = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Entrer un nombre :");
            enter =  sc.nextInt();
            if (enter > nbr){
                System.out.println("Plus petit");
                nbr_essaie ++;
            }
            else if(enter < nbr){
                System.out.println("Plus grand");
                nbr_essaie ++;
            }
        }while (enter != nbr);
        System.out.println("Bravo vous avez trouvez le nombre " + nbr + " en " + nbr_essaie + " essaie(s)");
    }
    public static void ordinateur(int nbr){

    }
}
