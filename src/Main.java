import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 1, 5);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
