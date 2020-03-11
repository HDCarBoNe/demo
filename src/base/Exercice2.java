package base;

public class Exercice2 {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        moyenne(array);
    }
    public static void moyenne(int[] tab){
        int somme = 0;
        for(int item: tab){
            somme += item;
        }
        System.out.println("La moyenne du tableau est de :" + (somme/tab.length));
    }
}
