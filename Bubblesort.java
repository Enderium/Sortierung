//Bubblesort Sortieralgorithmus von Timo Kettenbach
public class Bubblesort {
    
    public static int[] Sortieren(int[] liste) {
        for(int x=1;x<liste.length;x++) {
            for(int y=0;y<liste.length-x;y++) {
                if(liste[y]>liste[y+1]) {
                    liste=Sortiermethoden.Tauschen(liste,y,y+1);
                }
            }
        }
        return liste;
    }

    public static void main(String[] args) {
        for(int n=1000000;n<1000000001;n=n+1000) { 

            int[] listealt = Sortiermethoden.zufallsListe(n);
            listealt = Sortiermethoden.prüfung(listealt);
            long start = System.currentTimeMillis();
            int[] liste = Sortieren(listealt);
            long ende = System.currentTimeMillis();
            //Sortiermethoden.ausgabe(listealt);
            //Sortiermethoden.ausgabe(liste);
            System.out.println((ende-start)+";"+n);
        }
            } 
}