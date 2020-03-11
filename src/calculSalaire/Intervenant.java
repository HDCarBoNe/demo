package calculSalaire;

public abstract class Intervenant {
    protected String nom;
    protected String prenom;
    public abstract int getSalaire();

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void afficheDonnee(){
        System.out.println("Le nom est: "+nom);
        System.out.println("Le prénom est: "+prenom);
        System.out.println("Le salaire est: "+this.getSalaire());
    }
}
