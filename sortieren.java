public class sortieren{

    public int[]Tauschen(int []Zahlenreihe,int a, int b){
        int[] neueliste = new int[Zahlenreihe.length];

        for (int i=0;i<Zahlenreihe.length;i=i+1) {  
            neueliste[i] = Zahlenreihe[i];
        }
        neueliste[a] = Zahlenreihe[b];
        neueliste[b] = Zahlenreihe[a];
        return neueliste;
    }

    public  int[] AlgoII(int[]liste){
        int[]liste2 = new int[liste.length];
        liste2 = liste;
        int i=0;
        int n=0;
        while(liste[i]>liste[n]){
            n = i+1;
            liste2= Tauschen(liste2,i,n);
            i=i+1;
        }
        return liste2;
    }
}