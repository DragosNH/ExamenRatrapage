public class Multiply {

    private int a = 0, b = 0;

    public Multiply() {}

    public Multiply(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String multiply(int a, int b) {
        int sum = a * b;
        return "The result from multiplication is: " + sum;
    }

}
