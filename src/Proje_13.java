import java.util.Scanner;

public class Proje_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin 1 kenarını girin: ");
        int kenar1 = scanner.nextInt();

        System.out.print("Üçgenin 2 kenarını girin: ");
        int kenar2 = scanner.nextInt();

        System.out.print("Üçgenin 3 kenarını girin: ");
        int kenar3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Bu bir eşkenar üçgendir.");
        } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
            System.out.println("Bu bir ikizkenar üçgendir.");
        } else {
            System.out.println("Bu bir çeşitkenar üçgendir.");
        }
    }
}