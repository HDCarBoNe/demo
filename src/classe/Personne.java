package classe;

public class Personne {
    private String Nom;
    private int Score;

    public Personne(){
        System.out.println("Création d'un joueur!");
        Nom = "Inconnu";
        Score = 0;
    }

    public Personne(String pNom){
        System.out.println("Création du joueur "+pNom);
        Nom = pNom;
        Score = 0;
    }

    public int getScore() {
        return this.Score;
    }

    public String getNom() {
        return this.Nom;
    }

    public void setNom(String pNom) {
        Nom = pNom;
    }

    private void setScore(int pScore) {
        Score = pScore;
    }
}
