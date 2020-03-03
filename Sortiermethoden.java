public class Sortiermethoden {
    
    public static int[] Tauschen(int[] Zahlenreihe, int a, int b){
        int temp = Zahlenreihe[a];
        Zahlenreihe[a] = Zahlenreihe[b];
        Zahlenreihe[b] = temp;
        return Zahlenreihe;
    }

        public static void ausgabe(int[] liste) {
            System.out.print("{");
            for(int i=0; i<liste.length-1; i++) {
                System.out.print(liste[i]+",");
            }
            System.out.println(liste[liste.length-1]+"}");
        }

        public static int[] zufallsListe(int n) {
            int[] zliste = new int[n];
            for(int x=0;x<n;x++) {
                zliste[x] = (int) Math.floor(10000*Math.random());
            }
            return zliste;
        }

        public static int[] zufallsListe2(int n) {
            int[] zliste = new int[n];
            for(int i =0;i<n;i++ ){
                zliste[i] = i;
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

        public static int[] kopieren(int[] listealt) {
            int[] listeneu = new int[listealt.length];
            for(int i=0;i<listealt.length;i++) {
                listeneu[i] = listealt[i];
            }
            return listeneu;
        }

        public static boolean istSortiert(final int[] liste) {
            // ToDo
            for(int i=0;i<liste.length-1;i++) {
                if(liste[i]>=liste[i+1]) {
                    return false;
                }
            }
    
            return true;
        }
}