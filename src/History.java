public class History {

    public static int[] history(int a, int b, int[] hist){

        int last[] = new int[a + 1];

        for(int i = 0; i <= a; i++){
            last[i] = hist[i];
        }

        last[b] = a;

        return last;
    };

    @Override
    public String toString() {
        return "";
    }
}
