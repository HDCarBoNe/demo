package fonction;

import java.text.StringCharacterIterator;
import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*System.out.println("Entrez un nombre");
        int nbr = sc.nextInt();
        isPremier(nbr);
        isParfait(nbr);*/
        System.out.println("Entrez une chaine de caractère");
        String chaine = sc.nextLine();
        /*int nbr_ch = chaine.length();
        String[] tab_chaine= new String[nbr_ch];
        for (int i=0; i < nbr_ch; i++){
            tab_chaine[i] = String.valueOf(chaine.charAt(i));
        }
        trie(tab_chaine);*/
        isPalindrome(chaine);

    }
    // Vérifie si le nombre est premier
    public static void isPremier(int nbr){
        boolean isPremier = true;
        if (nbr < 0) {
            isPremier = false;
        }
        else if (nbr!=0 && nbr!=1) {
            for (int i=2; i <= nbr/2; i++) {
                if (nbr!=i && nbr%i == 0) {
                    isPremier = false;
                    break;
                }
            }
        }
        if (isPremier == true){
            System.out.println("Le nombre est premier");
        }
        else if(isPremier == false){
            System.out.println("Le nombre n'est pas premier");
        }
    }
    // vérifie si le nombre est parfait
    public static void isParfait(int nbr){
        int somme = 0;
        for (int i=1; i <= nbr; i++){
            if (nbr%i == 0){
                somme += i;
                System.out.println(somme);
            }
        }
        if (nbr*2 == somme){
            System.out.println("Le nombre est parfait");
        }
        else{
            System.out.println("Le nombre n'est pas parfait");
        }
    }
    // trie un tableau de chaine de caractère
    public static void trie(String[] tab){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","z"};
        String temp[] = new String[26];

        int index =0;
        for (int i = 0; i< alphabet.length;i++){
            for (int j =0; j < tab.length; j++){
                if (tab[j].equals(alphabet[i])){
                    temp[index] =  String.valueOf(tab[j]);
                    index ++;
                }
            }
        }
        String rendu = "";
        for (String item: temp){
            if (item != null){
                rendu = ""+item;
            }
        }
        System.out.println(rendu);
    }
    //Vérifie si la chain1 contient la chaine 2
    public static void isContains(String ch1, String ch2){


    }
    //Vérifie si la chain est un palindrome
    public static boolean isPalindrome(String ch){
        if(null ==ch){
            return false;
        }
        else {
            int lenght= ch.length();
            boolean result = true;
            for (int i= 0; i< lenght /2; i++){
                if (ch.charAt(i) != ch.charAt( lenght - (i+1))){
                    result = false;
                    break;
                }
            }
            return result;
        }
    }
}
