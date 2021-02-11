public class Quicksort {
    public static void sortieren(int[] liste) {
        quicksort(0, liste.length-1,liste);
    }
    public static void quicksort(int links, int rechts, int[] liste) {
        if(links >= rechts) {
            return;
        }
        int teiler = teile(links, rechts, liste);
        quicksort(links, teiler-1, liste);
        quicksort(teiler+1, rechts, liste);
        
        
    }

    public static int teile(int links, int rechts, int[] liste) {
        int i = links;
        int j = rechts;
        int pivot = liste[rechts];
        while(i < j) {
            while (i < rechts && liste[i] < pivot) {
                i = i + 1;
            }
            while (j > links && liste[j] > pivot) {
                j = j - 1;
            }
            if(i < j) {
                liste = Sortiermethoden.Tauschen(liste, i, j);
            }
            //if(links < j) {
              //  quicksort(links, j, liste);
            //}
            //if(rechts > i) {
              //  quicksort(i, rechts, liste);
            //}
        //}
        

        return i;
    }
    public static void main(String[] args) {
        for(int n=1000000;n<100000001;n=n+1000000) {
            int[] liste = Sortiermethoden.zufallsListe(n);
            long start = System.currentTimeMillis();
            quicksort(0, liste.length-1, liste);
            long ende = System.currentTimeMillis();
            System.out.println(n+";"+(ende-start));
        }
        //Sortiermethoden.ausgabe(liste);
        //System.out.println("hallo ich bin fertig!");
    }
}
