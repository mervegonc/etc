import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Elma");
        fruits.add("Muz");
        fruits.add("Elma"); // tekrar eklemeye çalışıyoruz
        fruits.add("Armut");

        // Tüm meyveleri yazdıralım
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Meyve sayısı: " + fruits.size()); // 3
    }
}
