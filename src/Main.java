import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        // Aynı veriler ekleniyor
        hashMap.put(3, "Üç");
        hashMap.put(1, "Bir");
        hashMap.put(2, "İki");

        linkedHashMap.put(3, "Üç");
        linkedHashMap.put(1, "Bir");
        linkedHashMap.put(2, "İki");

        treeMap.put(3, "Üç");
        treeMap.put(1, "Bir");
        treeMap.put(2, "İki");

        System.out.println("HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("\nLinkedHashMap:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("\nTreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
