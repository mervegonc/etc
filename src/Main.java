import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Ayşe", "Mehmet");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println("A ile başlayan: " + name));
    }
}
