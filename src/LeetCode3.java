import java.util.ArrayList;

public class LeetCode3 {

    public int lengthOfLongestSubstring(String s) {
        int uzunluk = 0;
        int yeniUzunluk = 0;
        int eskiUzunluk = 0;
        char ilkHarf = 0;
        char oncekiHarf = 0;
        boolean calistir = true;
        ArrayList<Character> harfler = new ArrayList<>();

        if(0 <= s.length() && s.length() <= (5 * Math.pow(10, 4))) {
            for (int i = 0; i < s.length(); i++) {
                char harf = s.charAt(i);

                if (i == 0) {
                    ilkHarf = harf;
                    oncekiHarf = harf;
                    uzunluk++;
                    harfler.add(harf);
                } else if (!harfler.contains(harf)) {
                    uzunluk++;
                    oncekiHarf = harf;
                    harfler.add(harf);
                } else {
                    ilkHarf = harf;
                    oncekiHarf = harf;

                    if (calistir) {
                        eskiUzunluk = uzunluk;
                    }

                    yeniUzunluk = uzunluk;
                    if (eskiUzunluk <= yeniUzunluk) {
                        eskiUzunluk = yeniUzunluk;
                    }

                    // Tekrarlayan karakterin bulunduğu noktadan itibaren sıfırlama işlemi
                    int tekrarIndeksi = harfler.indexOf(harf);
                    for (int j = 0; j <= tekrarIndeksi; j++) {
                        harfler.remove(0);  // İlk karakterden tekrarlayana kadar temizle
                    }

                    uzunluk = harfler.size() + 1;  // Temizledikten sonra uzunluğu yeniden hesapla
                    harfler.add(harf);
                    calistir = false;
                }
            }

            if (eskiUzunluk <= uzunluk) {
                return uzunluk;
            } else {
                return eskiUzunluk;
            }
        }

        return 0;
    }

}

