class LeetCode8 {
    public int myAtoi(String s) {
        StringBuilder yeniS = new StringBuilder();
        boolean negatifMi = false;
        if (!s.isBlank() && 1 <= s.length() && s.length() <= 200) {
            s = s.trim();

            if (!(s.charAt(0) >= 48 && s.charAt(0) <= 57) && (s.charAt(0) != 45 && s.charAt(0) != 43)) {
                return 0;
            }
            else if (s.length() > 1) {
                if (s.charAt(1) == 43 || s.charAt(1) == 45) {
                    if (s.charAt(0) == 45 || s.charAt(0) == 43) {
                        return 0;
                    }

                }
            }
            else if (s.length() == 1) {
                if (s.charAt(0) == 45) {
                    return 0;
                }
            }

            if (s.charAt(0) == 45) {
                negatifMi = true;
            }

            int i = 0;
            if (s.charAt(0) == 45 || s.charAt(0) == 43) {
                i = 1;
            }


            while (i < s.length() && s.charAt(i) == '0') {
                i++;
            }


            for (; i < s.length(); i++) {
                char karakter = s.charAt(i);

                if (karakter >= '0' && karakter <= '9') {
                    yeniS.append(karakter);
                } else {
                    break;
                }
            }

            if (yeniS.length() == 0) {
                return 0;
            }

            try {
                if (negatifMi) {

                    long deger = Long.parseLong(yeniS.toString());
                    if (-deger < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                    return (int) -deger;
                } else {

                    long deger = Long.parseLong(yeniS.toString());
                    if (deger > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    return (int) deger;
                }
            } catch (NumberFormatException e) {
                return negatifMi ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        } else {
            return 0;
        }
    }
}
