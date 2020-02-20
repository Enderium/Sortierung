public class Backsort {
    public static int[] Sortieren(int[] liste) {
            while(Sortiermethoden.istSortiert(liste) == false) {
                for(int x=0;x<liste.length;x++) {
                    for(int y=x+1;y<liste.length;y++) {
                        if(liste[y]<liste[x]) {
                            liste = Sortiermethoden.Tauschen(liste, y, x);
                        }
                    }
                }
            }
        return liste;
    }

    public static void main(String[] args) {
        for(int n=1000;n<100001;n=n+1000) { 

            int[] listealt = Sortiermethoden.zufallsListe(n);
            Sortiermethoden.zufallsListe(n);
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