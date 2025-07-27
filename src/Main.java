import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> studentNumber = new HashMap<>();

        studentNumber.put(7454,"Merve");
        studentNumber.put(7050,"Binali");
        studentNumber.put(1453,"Mehmet");

        for(Integer  number : studentNumber.keySet()){
            System.out.println(number);
        }

        for(String name : studentNumber.values()){
            System.out.println(name);
        }

        for (Map.Entry<Integer, String> entry : studentNumber.entrySet()){
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }
    }
}
