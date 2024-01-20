public class Proje_18 {
    private int atmNo;

    public Proje_18 (int atmNo) {
        this.atmNo = atmNo;
    }

    public int getAtmNo() {
        return atmNo;
    }

    public void setAtmNo(int atmNo) {
        this.atmNo = atmNo;
    }

    public void paraYatir(int miktar) {
        // Para yatırma işlemleri burada gerçekleştirilir
        System.out.println(miktar + " TL para yatırıldı.");
    }

    public void paraCek(int miktar) {
        // Para çekme işlemleri burada gerçekleştirilir
        System.out.println(miktar + " TL para çekildi.");
    }

    public boolean kayitKontrol(int hesapNo, String sifre) {
        // Hesap numarası ve şifre kontrolü burada gerçekleştirilir
        // Eğer hesap numarası ve şifre doğru ise true, değilse false döndürülür
        return true;
    }
}

