public class Substract {

    private int a = 0, b = 0;

    public Substract() {}

    public Substract(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String substraction(int a, int b) {
        int sum = a - b;
        return "Tre result from substraction is: " + sum;
    }

}
