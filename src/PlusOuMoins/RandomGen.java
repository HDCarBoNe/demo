package PlusOuMoins;

import java.util.Random;

public class RandomGen {
    public static int generate(int max){
        int min =0;
        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(max - min + 1) + min;
        return nombreAleatoire;
    }
}
