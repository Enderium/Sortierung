public class Zeitmessung {
    public static long zeitfresser(int n) {
        int j=1;
        for(int i=0;i<n;i++) {j=j*2;};

        long start = System.currentTimeMillis();
        double x = 0;
        for(int i=0;i<j;i++) {
            x = x+Math.random();
        }
        long ende = System.currentTimeMillis();
        return ende-start;
    }

    public static void main(String[] args) {
        for(int i=0;i<=30;i++) {
            System.out.println(i+" : "+zeitfresser(i));
        }
    }
}