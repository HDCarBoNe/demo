package exception;

import java.io.IOException;

public class App {
    public static void m2() {
        System.out.println("M2 begins");
        try {
            App2.m();
        }catch (Exception e){
            System.out.println("N'autorise pas la division par zéro ! \nMessage: " +e.getMessage());
        }
        System.out.println("M2 ends");
    }

    public static void m1(){
        System.out.println("M1 begins");
        m2();
        System.out.println("M1 ends");
    }
    public static void main(String[] args) {
        System.out.println("Main begins");
        m1();
        System.out.println("Main ends");
    }
}
