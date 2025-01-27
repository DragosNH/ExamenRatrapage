public class History {

    public static int[] history(int a, int his[], int b){

        int last[] = new int[a + 1];

        for(int i = 0; i <= a; i++){
            last[i] = his[i];
        }

        last[b] = a;

        return last;
    };


}
