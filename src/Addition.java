public class Addition {
    private int a = 0, b = 0;

    public Addition() {}

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String addition(int a, int b) {
        int sum = a + b;
        return "t result from addition is: " + sum;
    }

}
