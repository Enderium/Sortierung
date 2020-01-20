import java.time;
public class Zeitmessung {
    public static long zeitfresser(int n) {
        int j=1;
        for(int i=0;i<n;i++) {j=j*2;};

        long start = java.time.Instant.now();
        double x = 0;
        for(int i=0;i<j;i++) {
            x = x+Math.random();
        }
        long ende = java.time.Instant.now();
        return ende-start;
    }

    public static void main(String[] args) {
        long ergebnis = zeitfresser(1);
        System.out.println(ergebnis);
    }
}