public class LeetCode1 {

    public static int[] twoSum(int[] nums, int target) {
        int basamak = 0;
        if (nums.length >= 2 && nums.length <= Math.pow(10, 9)
                && target >= -Math.pow(10, 9) && target <= Math.pow(10, 9)) {
            for ( int i = 0; i<nums.length; i++ ) {
                if ( i != basamak && nums[basamak] + nums[i] == target){
                    return new int[]{basamak,i};
                }
                else if (i == nums.length-1){
                    basamak++;
                    i=0;
                }
            }

        }
        return new int[]{};
    }

}
