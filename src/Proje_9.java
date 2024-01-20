
public class Proje_9 {
    public static void main(String[] args) {
        int number = 12345; // Çevrilecek sayı

        String binary = Integer.toBinaryString(number); // Sayıyı ikilik tabana çevir
        String octal = Integer.toOctalString(number); // Sayıyı sekizlik tabana çevir
        String hexadecimal = Integer.toHexString(number); // Sayıyı onaltılık tabana çevir

        System.out.println("Bir Sayının ikilik tabandaki karşılığı: " + binary);
        System.out.println("Bir Sayının onluk tabandaki karşılığı: " + hexadecimal);
    }
}