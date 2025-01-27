public class Division {

    private int a = 0, b = 0;

    public Division() {}

    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String divide(int a, int b) {
        int sum = a / b;
        return "Result is: " + sum;
    }

}
