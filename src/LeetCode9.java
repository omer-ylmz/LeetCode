public class LeetCode9 {
    public boolean isPalindrome(int x) {
        if(-Math.pow(2,31) <= x & Math.pow(2,31) - 1 >= x){
            if(x<0){
                return false;
            }
            String YaziX = String.valueOf(x);
            StringBuilder TersYaziX = new StringBuilder();

            for (int i = YaziX.length() - 1; i >= 0; i--) {
                char c = YaziX.charAt(i);
                TersYaziX.append(c);
            }
            if (TersYaziX.toString().equals(YaziX.toString())){
                return true;
            }
        }

        return false;
    }
}
