import java.util.Scanner;

public class Proje_1 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess;
        int attempts = 0;
        boolean found = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 ile 100 arasında bir sayıyı tahmin edin.");

        while (!found) {
            System.out.print("Tahmininizi girin: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                found = true;
                System.out.println("Tebrikler, ilk seferde buldunuz!");
            } else if (guess < randomNumber) {
                System.out.println("Daha yüksek bir sayı girin.");
            } else {
                System.out.println("Daha düşük bir sayı girin.");
            }
        }

        System.out.println("Tahmin etmek için " + attempts + " deneme yaptınız.");

        scanner.close();
    }
}