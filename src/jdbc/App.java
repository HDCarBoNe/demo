package jdbc;

import java.sql.*;
import java.util.Scanner;

public class App {
    private static final String DRIVER_CLASS = "org.mariadb.jdbc.Driver";
    private static final String DB_URL= "jdbc:mariadb://localhost:3306/java";
    private static final String DB_LOGIN = "javauser";
    private static final String DB_PWD = "javapwd";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM T_USER";
    private static final String FIND_LOG_AND_PASS = "SELECT * FROM T_USER WHERE login = ? AND password = ?";
    public static void main(String[] args) {
        loginPST();
    }

    public static void loginBad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenu, merci de vous identifier...");
        System.out.println("Login:");
        String login = sc.nextLine();
        System.out.println("Password:");
        String pwd = sc.nextLine();
        String query = "SELECT * FROM T_USER WHERE login ='"+login+"' AND password='"+pwd+"'";
        //System.out.println(query);

        try {
            Class.forName(DRIVER_CLASS);
            Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            if(rs.next()){
                System.out.printf("Bienvenu %s%n", rs.getString("login"));
            }
            else {
                System.out.println("Nom d'utilisateur ou mot de passe Invalide !");
            }
            rs.close();
            st.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Merci d'importer les dépendances nécessaires");
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Problème de connexion à la base de données");
        }
    }

    public static void loginPST(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenu, merci de vous identifier...");
        System.out.println("Login:");
        String login = sc.nextLine();
        System.out.println("Password:");
        String pwd = sc.nextLine();
        String query = "SELECT * FROM T_USER WHERE login ='"+login+"' AND password='"+pwd+"'";

        try {
            Class.forName(DRIVER_CLASS);
            Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);
            PreparedStatement pst = connection.prepareStatement(FIND_LOG_AND_PASS);
            pst.setString(1, login);
            pst.setString(2, pwd);
            System.out.println(pst);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                System.out.printf("Bienvenu %s%n", rs.getString("login"));
            }
            else {
                System.out.println("Nom d'utilisateur ou mot de passe Invalide !");
            }
            rs.close();
            pst.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Merci d'importer les dépendances nécessaires");
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Problème de connexion à la base de données");
        }
    }
}
