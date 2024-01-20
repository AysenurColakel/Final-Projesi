
public class Proje_5 {
    public static void main(String[] args) {
        int number = 12345; // Ayırılacak sayı

        String formattedNumber = formatNumber(number);

        System.out.println("Ayırılmış sayı: " + formattedNumber);
    }

    public static String formatNumber(int number) {
        String numberString = String.valueOf(number); // Sayıyı stringe çevirme
        StringBuilder formattedNumber = new StringBuilder();

        int count = 0;
        for (int i = numberString.length() - 1; i >= 0; i--) {
            formattedNumber.insert(0, numberString.charAt(i)); // Sayının sonundan başlayarak basamakları ekliyoruz
            count++;

            if (count % 3 == 0 && i != 0) {
                formattedNumber.insert(0, ","); // Her üç basamakta bir virgül ekliyoruz
            }
        }

        return formattedNumber.toString();
    }
}
