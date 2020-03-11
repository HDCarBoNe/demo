package base;

public class Exercie1 {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        display(array,"Affichage du tableau:");
        displayInvert(array);
        displayIntSup(array,3);
        displayIntPair(array);
        displayIntImpair(array);
        displayIndexPair(array);
        searchUp(array);
        searchLow(array);
    }
    public static void display(int[] tab,String str){
        System.out.println(str);
        String result = "";
        for (int item: tab){
            result += " ["+item+"] ";
        }
        System.out.println(result);
    }

    public static void displayInvert(int[] tab){
        int[] temp = new int[tab.length];
        int j = 0;
        for (int i = tab.length -1; i >= 0; i--){
            temp[j]=tab[i];
            j++;
        }
        display(temp,"Affichage du tableau Inversé:");
    }

    public static void displayIntSup(int[] tab, int nbr){
        int nbr_sup= 0;
        for(int item: tab){
            if (item > nbr){
                nbr_sup ++;
            }
        }
        int[] temp = new int[nbr_sup];
        int i =0;
        for (int item:tab){
            if (item > nbr){
                temp[i]= item;
                i ++;
            }
        }
        display(temp, "Affichage du tableau avec les entier supérieur à "+nbr+" :");
    }

    public static void displayIntPair(int[] tab){
        int nbr_pair = 0;
        for (int item: tab){
            if ((item%2) == 0){
                nbr_pair ++;
            }
        }
        int[] temp = new int[nbr_pair];
        int i = 0;
        for (int item: tab){
            if ((item%2)==0){
                temp[i]=item;
                i++;
            }
        }
        display(temp, "Affichage du tableau avec les entiers pairs: ");
    }

    public static void displayIndexPair(int[] tab){
        int nbr_indexPair;
        if ((tab.length%2) != 0){
            nbr_indexPair = tab.length/2 + 1;
        }
        else {
            nbr_indexPair = tab.length/2;
        }
        int[] temp = new int[nbr_indexPair];
        int j = 0;
        for (int i=0; i<tab.length; i+=2){
            temp[j]=tab[i];
            j++;
        }
        display(temp, "Affichage du tableau avec les index pairs: ");
    }

    public static void displayIntImpair(int[] tab){
        int nbr_impair = 0;
        for (int item: tab){
            if ((item%2) != 0){
                nbr_impair ++;
            }
        }
        int[] temp = new int[nbr_impair];
        int i = 0;
        for (int item: tab){
            if ((item%2)!=0){
                temp[i]=item;
                i++;
            }
        }
        display(temp, "Affichage du tableau avec les entiers impairs: ");
    }

    public static void searchUp(int[] tab){
        int temp = -999999999;
        for (int item: tab){
            if (item > temp){
                temp = item;
            }
        }
        System.out.println("Le nombre le plus grand est "+ temp );
    }

    public static void searchLow(int[] tab){
        int temp = 999999999;
        for (int item: tab){
            if (item < temp){
                temp = item;
            }
        }
        System.out.println("Le nombre le plus petit est "+ temp );
    }
}
