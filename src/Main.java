import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Elma", "Muz", "Portakal");

        fruits.forEach(fruit -> System.out.println("Meyve: " + fruit));
    }
}
