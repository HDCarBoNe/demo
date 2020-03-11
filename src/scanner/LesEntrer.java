package scanner;
import java .util.Scanner;

public class LesEntrer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Holla ");
        System.out.print("Entrez votre nom: ");
        String name = sc.nextLine();
        System.out.println("Entrez votre age: ");
        byte age = sc.nextByte();

        System.out.println(name + " baise des daronnes de " +age+" ans");
    }
}
