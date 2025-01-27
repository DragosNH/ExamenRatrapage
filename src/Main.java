public class Main {
    public static void main(String[] args) {

        Addition add = new Addition();
        Substract sub = new Substract();
        Multiply mul = new Multiply();
        Division div = new Division();
        Modulo mod = new Modulo();

        System.out.println(add.addition(66, 8));
        System.out.println(sub.substraction(55, 80));
        System.out.println(mul.multiply(3,6));
        System.out.println(div.divide(8,8));
        System.out.println(mod.modulo(3,6));

    }
}