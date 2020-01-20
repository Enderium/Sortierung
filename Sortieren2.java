public class Sortieren2 {
    public static void ausgabe(int[] liste) {
        System.out.println("{");
        for(int i=0; i<liste.length-1; i++) {
            System.out.println(liste[i]+",");
        }
        System.out.println(liste[liste.length-1]+"}");
    }

    public static int[] zufallsListe(int n) {
        int[] zliste = new int[n];
        for(int x=0;x<n;x++) {
            zliste[x] = (int) Math.floor(100*Math.random());
        }
        return zliste;
    }

    public static int[] prüfung(int[] liste) {
        for(int n=0;n<liste.length;n++) {
            for(int a=0;a<n;a++) {
                while(liste[n]==liste[a]) {
                    liste[n] = (int) Math.floor(100*Math.random());
                    a = 0;
                }
            }
        }
        return liste;
    }

    public static int[] sortieren(int[] liste) {
        int klein;
        for(int x=0;x<liste.length;x++) {
            for(int y=0;y<x;y++) {
                if(liste[x]<liste[y]) {
                    klein = liste[x];
                }
            }
        }
        return liste;
    }

    public static void main(String[] args) {
        int[] zliste = zufallsListe(11);
        int[] neueliste = prüfung(zliste);
        
        ausgabe(zliste);
        ausgabe(neueliste);
    }
}