package exception;

import java.io.*;

public class App2 {

    public static void m() throws Exception {
        System.out.println("M begins");
        int nb = (int) (Math.random() * 3);
        System.out.println("la division de 2/"+nb+" est égale à: "+2/nb);
        System.out.println("M ends");
    }
}
