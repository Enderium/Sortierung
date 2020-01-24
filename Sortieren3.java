public class Sortieren3 {
    public static int[] Sortieren(int[] listeAlt) {
        int[] listeNeu = listeAlt;
            while(Sortieren1.istSortiert(listeAlt) == false) {
                for(int x=0;x<listeNeu.length;x++) {
                    for(int y=x+1;y<listeNeu.length;y++) {
                        if(listeNeu[y]<listeNeu[x]) {
                            listeNeu = Tauschen(listeNeu; listeNeu[y]; listeNeu[x]);
                        }
                    }
                }
            }
        return listeNeu;
    }

    public int[]Tauschen(int[] Zahlenreihe, int a, int b){
        int[] neueliste = new int[Zahlenreihe.length];

        for (int i=0;i<Zahlenreihe.length;i=i+1) {  
            neueliste[i] = Zahlenreihe[i];
        }
        neueliste[a] = Zahlenreihe[b];
        neueliste[b] = Zahlenreihe[a];
        return neueliste;
    }
    public static void main(String[] args) {
        int[] liste = Sortieren
    }
}