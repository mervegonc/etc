import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("ali", "ayşe", "mehmet");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
