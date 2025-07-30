import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin girin: ");
        String input = scanner.nextLine();

        // Burada yazma ve okuma işlemlerine geçeceğiz
        // Kullanıcının girdiği input değişkeni kullanılıyor
        try {
            FileWriter writer = new FileWriter("kullanici.txt");
            writer.write(input);
            writer.close();
            System.out.println("Metin dosyaya yazıldı.");
        } catch (IOException e) {
            System.out.println("Yazma hatası: " + e.getMessage());
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("kullanici.txt"));
            String line;
            System.out.println("Dosyadaki içerik:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Okuma hatası: " + e.getMessage());
        }


    }
}
