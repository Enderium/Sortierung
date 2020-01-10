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
        int x = 0;
        while(x<n) {
            zliste[x] = (int) Math.floor(100*Math.random());
            x = x+1;
        }
        return zliste;
    }

    public static void main(String[] args) {
        int[] zliste = zufallsListe(5);
        ausgabe(zliste);

    }
}