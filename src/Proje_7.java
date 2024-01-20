
import java.util.Scanner;

public class Proje_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumAbove50 = 0;
        int sumBelow50 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Bir sayı girin (0-100 arası): ");
            int number = scanner.nextInt();

            if (number >= 50) {
                sumAbove50 += number;
            } else {
                sumBelow50 += number;
            }
        }

        double ratio = (double) sumAbove50 / sumBelow50;

        System.out.println("50 ve üstü olanların toplamı: " + sumAbove50);
        System.out.println("50'den küçük olanların toplamı: " + sumBelow50);
        System.out.println("Oran: " + ratio);
    }
}
