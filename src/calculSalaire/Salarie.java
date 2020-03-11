package calculSalaire;

public class Salarie extends Intervenant {
    private int salMen;

    public Salarie(String nom, String prenom, int salMen) {
        super(nom, prenom);
        this.salMen = salMen;
    }

    public int getSalMen() {
        return salMen;
    }

    public void setSalMen(int salMen) {
        this.salMen = salMen;
    }

    public void afficheDonnee(){
        super.afficheDonnee();
        System.out.println("Statut: Salarié");
    }

    @Override
    public int getSalaire() {
        return salMen;
    }
}
