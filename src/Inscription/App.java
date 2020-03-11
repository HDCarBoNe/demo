package Inscription;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int index =0;
        String tabPersonne[][] = new String[10][2];
        menu(tabPersonne);
    }
    public static String[][] addPersonne(String[][] tab){
        Scanner sc = new Scanner(System.in);
        int l = getIndex(tab);
        String prenom;
        String nom;
        System.out.println("Entrer le prénom de la personne à ajouter: ");
        prenom = sc.nextLine();
        System.out.println("Entrer le nom de la personne à ajouter: ");
        nom = sc.nextLine();
        tab[l]= new String[]{prenom, nom};
        //tab[l][0] = prenom;
        //tab[l][1] = nom;
        return tab;
    }

    public static void listerPersonne(String tab[][]){
        for (String[] item: tab) {
            System.out.println("Le prénom: "+ item[0]+"\n Le nom: "+item[1]);
        }
    }

    public static void getPosition(String tab[][], String obj){
        int pos = 0;
        for (String[] item: tab){
            pos ++;
            if (item[0].equals(obj)){
                System.out.println(obj + " a été trouver à la position" + pos +":0");
                menu(tab);
            }
            else if(item[1].equals(obj)){
                System.out.println(obj + " a été trouver à la position" + pos +":1");
                menu(tab);
            }
        }
        System.out.println("Nous n'avons pas trouvez de correspondances");
    }

    public static int getIndex(String tab[][]){
        int i = 0;
        for (String[] item: tab) {
            if (item[0] == null){
                return i;
            }
            else if (i == tab.length){

            }
            else {
                i++;
            }
        }
        return -1;
    }

    public static void menu(String tab [][]){
        int choix;
        do{
            System.out.println("Que voulez-vous ?");
            System.out.println("1 - Ajouter une personne");
            System.out.println("2 - Lister les personnes inscritent");
            System.out.println("3 - Rechercher une personne");
            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
            switch (choix){
                case 1: addPersonne(tab);
                    break;

                case 2: listerPersonne(tab);
                    break;

                case 3:
                    System.out.println("Qui rechercher vous ?");
                    sc.nextLine();
                    getPosition(tab, sc.nextLine());
                    break;

                default:
                    System.out.println("Choix invalide");
                    menu(tab);
                    break;
            }
        }while (choix != 99);
    }
}
