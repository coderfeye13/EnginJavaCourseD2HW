public class Main {
    public static void main(String[] args) {
        sayiBulmaca();

    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int arancak = 6;
        boolean varMi = false;

        for (int sayi = 0; sayi < sayilar.length; sayi++) {
            if (sayi == arancak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesajVer("Sayı mevcuttur: " + arancak);
        }
        else {
            mesajVer("Sayı mevcut değildir: " + arancak);
        }
    }
    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}