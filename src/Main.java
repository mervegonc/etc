import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 10, 15);

        int sum = numbers.stream().mapToInt(n -> n).sum();
        long count = numbers.stream().count();
        int max = numbers.stream().mapToInt(n -> n).max().orElse(0);

        System.out.println("Toplam: " + sum);
        System.out.println("Eleman sayısı: " + count);
        System.out.println("En büyük: " + max);
    }
}
