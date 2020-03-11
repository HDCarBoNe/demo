package classe;

public class Partie {
    private static final int MIN_VALUE = 1;
    private static  final int MAX_VALUE = 6;
    private Personne playerOne;
    private Personne playerTwo;
    private String label;
    private int[][] scores;
    private int nbTours;

    public Partie(Personne playerOne, Personne playerTwo, String label, int nbTours) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.label = label;
        this.nbTours = nbTours;
        scores = new int[nbTours+1][2];
    }

    public Personne getPlayerOne() {
        return playerOne;
    }

    public Personne getPlayerTwo() {
        return playerTwo;
    }

    public String getLabel() {
        return label;
    }

    public void setPlayerOne(Personne playerOne) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(Personne playerTwo) {
        this.playerTwo = playerTwo;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public static int random (){
        int nbr = (int)(Math.random() * ((MAX_VALUE+1) - MIN_VALUE)) + MIN_VALUE;
        return nbr;
    }

    public void start() {
        System.out.println("Démarrage de la partie...");
        System.out.println("Elle se jouera en "+this.nbTours+" tours");
        for (int i = 1; i <= nbTours; i++){
            scores[0][0] += scores[i][0] = Partie.random();
            scores[0][1] += scores[i][1] = Partie.random();
            System.out.printf("Génération pour le tours %d : %s = %d %s = %d ",i,playerOne.getNom(),scores[i][0],playerTwo.getNom(),scores[i][1]);
        }
    }

    public Personne getWinner(){
        if (scores[0][0] > scores[0][1]){
            return playerOne;
        }
        else if (scores[0][0] < scores[0][1]){
            return playerTwo;
        }
        else {
            return null;
        }
    }
}
