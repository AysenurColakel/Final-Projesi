public class Proje_17 {
    public static void main(String[] args) {
        String text = "Benim Adım Aysenur COlakel";
        int vowelCount = 0;
        int consonantCount = 0;

        text = text.toLowerCase(); // Metni küçük harflere dönüştürüyoruz

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Sesli harf sayısı: " + vowelCount);
        System.out.println("Sessiz harf sayısı: " + consonantCount);
    }
}
