package array;

import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {
        moyenneTAB();
    }

    public static void moyenneTAB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de personne:");
        int nb = sc.nextInt();
        int tableauAge[] = new int[nb];
        for (int i=0; i<nb;i++){
            System.out.println("Entrer l'age de la personne "+ (i+1) +" :");
            int in = sc.nextInt();
            tableauAge[i]=in;
        }
        int somme = 0;
        for (int item : tableauAge ){
            somme += item;
        }
        System.out.println("La moyenne d'ages est :" + (somme/tableauAge.length));
    }

    public static void moyenneSansTab() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez l'age 1 :");
        int a1 = sc.nextInt();
        System.out.println("Entrez l'age 2 :");
        int a2 = sc.nextInt();

        System.out.println("La moyenne d'ages est :" + (a1+a2)/2.0);
    }
}
