import java.util.*;

public class Sortieren2 {

    public static int[] zufallsListe(int n) {
        int[] zliste = new int[n];
        for(int x=0;x<n;x++) {
            zliste[x] = (int) Math.floor(100000*Math.random());
        }
        return zliste;
    }

    public static int[] prüfung(int[] liste) {
        for(int n=0;n<liste.length;n++) {
            for(int a=0;a<n;a++) {
                while(liste[n]==liste[a]) {
                    liste[n] = (int) Math.floor(100000*Math.random());
                    a = 0;
                }
            }
        }
        return liste;
    }

    public static int[] sortieren(int[] liste) {
        java.util.Arrays.sort(liste);
        return liste;
    }

    public static void main(String[] args) {
        int[] zliste = zufallsListe(11);
        int[] neueliste = prüfung(zliste);
        int[] Sortiert = sortieren(neueliste);
        
        //ausgabe(zliste);
        Sortiermethoden.ausgabe(neueliste);
        Sortiermethoden.ausgabe(Sortiert);

    }
}