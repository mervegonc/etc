import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Merve", "Ali", "Mehmet", "Ayşe", "Mustafa");

// Uzunluğu 5'ten büyük olanları yazdır
        names.stream()
                .filter(name -> name.length() > 5)
                .forEach(System.out::println);


        List<String> names1 = Arrays.asList("merve", "ali", "mehmet", "ayşe");

        names1.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);



        Map<Integer, String> students = Map.of(
                1, "Merve",
                2, "Ali",
                3, "Ayşe"
        );

        students.values().stream()
                .forEach(System.out::println);




        List<Integer> numbers2 = Arrays.asList(10, 20, 30, 40);

        int total = numbers2.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Toplam: " + total);

    }
}
