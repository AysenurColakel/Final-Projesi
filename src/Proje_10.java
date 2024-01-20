public class Proje_10 {
    public static void main(String[] args) {
        int n = 20; // Asal sayıları bulmak için aralık

        System.out.println("Asal sayılar:");

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Bir sayının asal olup olmadığını kontrol eder
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}