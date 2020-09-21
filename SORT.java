// DESCRIPTION DU CODE //
/* Ce code permet de trier une liste de mot et de li enlever ces doublons
 */


// PSEUDO CODE //
/* On instancie une liste 
On trie cette liste
On crée une deuxieme liste
POUR toute les valeurs de la 1ere liste 
et POUR toute les valeurs de la 2eme liste
SI un mot de la 1ere liste est déja present dans la deuxieme alors ce mot devient null
On affiche la 2eme liste
*/


// IMPLENTATION DU CODE //

import java.util.Arrays;

class SORT {
    public static void main (String[] args) {

        String[] list = { "balle", "avion", "zebre", "papier", "feuille", "roche", "avion", "feuille", };
        Arrays.sort(list);
        String[] sortedList = new String[list.length];
        

        for (int i = 0; i < list.length; i++ ) {
            int indexAtWord = -1;
            String word = list[i];

            for(int j = 0; j < sortedList.length; j++) {
                if(sortedList[j] == null || sortedList[j].equals(word)) {
                    indexAtWord = j;
                }
            }

            if(indexAtWord >= 0) {
                sortedList[indexAtWord] = word;
            }
        }
        
        System.out.println(Arrays.toString(sortedList));

    }
}

