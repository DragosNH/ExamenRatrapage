public class Modulo {

    private int a = 0, b = 0;

    public Modulo() {}

    public Modulo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String modulo(int a, int b) {
        int sum = a % b;
        return a + "%" + b + "=" + sum;
    }

}
