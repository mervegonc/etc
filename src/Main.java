@FunctionalInterface
interface NamePrinter {
    void print(String name);
}

public class Main {
    public static void main(String[] args) {
        NamePrinter p = name -> System.out.println("Merhaba " + name);
        p.print("Merve"); // Merhaba Merve
    }
}
