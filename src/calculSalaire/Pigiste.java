package calculSalaire;

public class Pigiste extends Intervenant {
    private int salJour;
    private int nbrJour;

    public Pigiste(String nom, String prenom, int salJour, int nbrJour) {
        super(nom, prenom);
        this.salJour = salJour;
        this.nbrJour = nbrJour;
    }

    public int getSalJour() {
        return salJour;
    }

    public void setSalJour(int salJour) {
        this.salJour = salJour;
    }

    public int getNbrJour() {
        return nbrJour;
    }

    public void setNbrJour(int nbrJour) {
        this.nbrJour = nbrJour;
    }

    public void afficheDonnee(){
        super.afficheDonnee();
        System.out.println("Statut: Pigiste");
    }

    @Override
    public int getSalaire() {
        return salJour*nbrJour;
    }
}
