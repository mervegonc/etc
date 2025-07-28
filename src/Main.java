import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Ali", "Ayşe", "Veli");

        list.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println("A ile başlayan: " + name));
    }
}
