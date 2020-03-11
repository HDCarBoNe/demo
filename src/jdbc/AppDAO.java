package jdbc;

import jdbc.bo.User;
import jdbc.dal.UserDAO;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;

public class AppDAO {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
            dspMainMnu();
    }

    public static void createContact(){
        System.out.println("**************************************");
        System.out.println("*       CREATION D'UN CONTACT        *");
        System.out.println("**************************************");
        System.out.println("\n\n Nom de l'utilisateur: ");
        String name = sc.nextLine();
        System.out.println("Login: ");
        String login = sc.nextLine();
        System.out.println("Mot de passe: ");
        String password = sc.nextLine();
        //String name, login, password;
        //TODO

        User user = new User(name, login, password);
        UserDAO userDAO = new UserDAO();
        try {
            userDAO.create(user);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("L'utilisateur "+user.getLogin()+" à été créer");
        dspMainMnu();
    }

    public static void editContact() {
        System.out.println("**************************************");
        System.out.println("*     MODIFICATION D'UN CONTACT      *");
        System.out.println("**************************************");
        System.out.println("\n\n Entrer l'id de l'utilisateur à supprimée: ");
        int id = sc.nextInt();
        sc.nextLine();

        UserDAO userDAO = new UserDAO();
        try {
            User user = userDAO.findById(id);
            System.out.println("Est-ce bien cet utilisateur que vous souhaité modifier ? [y/n] \n"+ user );
            String choix = sc.nextLine();
            if (choix.equals("Y") || choix.equals("y")){
                System.out.println("Laissez vide pour ne pas modifier");
                System.out.println("Modifier le nom ("+user.getName()+"):");
                String nom = sc.nextLine();
                System.out.println("Modifier le mot de passe:");
                String password = sc.nextLine();
                if (nom != ""){
                    user.setName(nom);
                }
                if (password != ""){
                    user.setPassword(password);
                }
                userDAO.update(user);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        dspMainMnu();
    }
    public static void deleteContact(){
        System.out.println("**************************************");
        System.out.println("*     SUPPRESSION D'UN CONTACT       *");
        System.out.println("**************************************");
    }
    public static void listContact(){
        System.out.println("**************************************");
        System.out.println("*         LISTE DES CONTACTS         *");
        System.out.println("**************************************");
        UserDAO userDAO = new UserDAO();
        try {
            Set<User> user = userDAO.findAll();
            for (User item: user) {
                System.out.println(item);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        dspMainMnu();
    }

    public static void dspMainMnu(){
        System.out.println("**************************************");
        System.out.println("*                 Menu               *");
        System.out.println("* 1. Créer un contact                *");
        System.out.println("* 2. Modifier un contact             *");
        System.out.println("* 3. Supprimer un contact            *");
        System.out.println("* 4. Lister les contacts             *");
        System.out.println("* 99. Quitter                        *");
        System.out.println("**************************************");
        System.out.println("\n Votre choix:");
        int choix = sc.nextInt();
        sc.nextLine();
        switch (choix){
            case 1:
                createContact();
                break;
            case 2:
                editContact();
                break;
            case 3:
                deleteContact();
                break;
            case 4:
                listContact();
                break;
            case 99:
                System.exit(1);
            default:
                dspMainMnu();
                break;
        }
    }
}
