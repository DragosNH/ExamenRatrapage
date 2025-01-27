public class Multiply {

    private int a = 0, b = 0;

    public Multiply() {}

    public Multiply(int a, int b) {
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

    public String multiply(int a, int b) {
        int sum = a * b;
        return "Result is: " + sum;
    }

}
