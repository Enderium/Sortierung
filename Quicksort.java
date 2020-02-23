public class Quicksort {
    public static int[] Sortieren(int[] liste) {
        liste = quicksort(0, liste.length-1, liste);
        
        return liste;
    }
    public static void quicksort(int links, int rechts, int[] liste) {
        if (links < rechts) {
            int teiler = teile(links, rechts, liste);
            quicksort(links, teiler-1);
            quicksort(teiler+1, rechts);
        }
    }
    public static int teile(int links, int rechts, int[] liste) {
        int i = links;
        int j = rechts-1;
        int pivot = liste[rechts]
        while (i < rechts && liste[i] < pivot) {
            i = i + 1;
        }
        while (j > links && liste[j] >= pivot) {
            j = j + 1;
        }
        if(i < j) {
            liste = Sortiermethoden.Tauschen(liste, liste[i], liste[j]);
        }

        return i;
    }
    public static void main(String[] args) {
        int[] liste = Sortiermethoden.zufallsliste;
        quicksort(0; liste.length-1; liste);
        Sortiermethoden.ausgabe(liste)
    }
}