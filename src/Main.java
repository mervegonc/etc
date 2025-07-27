import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        int[] sayilar = {10, 5, 20};

        for (int s : sayilar) {
            hashSet.add(s);
            linkedSet.add(s);
            treeSet.add(s);
        }

        System.out.println("HashSet (karışık): " + hashSet);
        System.out.println("LinkedHashSet (ekleme sırası): " + linkedSet);
        System.out.println("TreeSet (küçükten büyüğe): " + treeSet);
    }
}
