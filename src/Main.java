import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Elma", "Armut", "Kiraz");

        list.stream().forEach(item -> System.out.println("Meyve: " + item));
    }
}
