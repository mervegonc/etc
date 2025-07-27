@FunctionalInterface
interface Multiplier {
    int multiply(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Multiplier m = (a, b) -> a * b;
        System.out.println("Çarpım: " + m.multiply(4, 5)); // 20
    }
}
