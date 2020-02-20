public class Alletest {
    public static void main(String[] args) {
        for(int n=1000;n<100001;n=n+1000){
            int[] liste = Sortiermethoden.zufallsListe(n);
            liste = Sortiermethoden.prüfung(liste);
            int[] liste2 = Sortiermethoden.kopieren(liste);
            int[] liste3 = Sortiermethoden.kopieren(liste);
            long start0 = System.currentTimeMillis();
            liste = Backsort.Sortieren(liste);
            long ende0 = System.currentTimeMillis();
            long start1= System.currentTimeMillis();
            liste2 = Bubblesort.Sortieren(liste2);
            long ende1 = System.currentTimeMillis();
            System.out.println(n+";"+(ende0-start0)+";"+(ende1-start1));
        }

    }

}