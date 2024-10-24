public class LeetCode7 {
    public int reverse(int x) {
        boolean sayiNegatifMi = false;
        if (-Math.pow(2, 31) <= x && x <= Math.pow(2, 31) - 1) {
            if (x < 0) {
                sayiNegatifMi = true;
                x = -(x);
            }

            String yaziX = String.valueOf(x);
            StringBuilder yeniYaziX = new StringBuilder();

            // Sayının basamaklarını tersine çevir
            for (int i = yaziX.length() - 1; i >= 0; i--) {
                char karakterX = yaziX.charAt(i);
                if (karakterX != (char) 0) {
                    yeniYaziX.append(karakterX);
                }
            }

            try {
                int yeniSayi = Integer.parseInt(String.valueOf(yeniYaziX));

                if (sayiNegatifMi) {
                    return -yeniSayi;
                }
                return yeniSayi;

            } catch (NumberFormatException e) {
                return 0;
            }
        }
        return 0;
    }
}
