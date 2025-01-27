public class Addition {
    private int a = 0, b = 0;

    public Addition() {}

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

    public String addition(int a, int b) {
        int sum = a + b;
        return "Result is: " + sum;
    }
}
