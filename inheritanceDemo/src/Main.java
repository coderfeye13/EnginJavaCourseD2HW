public class Main {
    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        TarimKrediManager tarimKrediManager = new TarimKrediManager();
        KrediUI.KrediHesapla(new OgretmenKrediManager());
        KrediUI.KrediHesapla(new AskerKrediManager());
    }
}