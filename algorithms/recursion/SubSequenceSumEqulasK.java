import java.util.*;
public class SubSequenceSumEqulasK {
    public static void main(String[] args) {
        int [] nums = {0, 0, 5,0,0,0};
        int k = 5;
       

        int [] arr = {0};
        System.out.println(helper(nums, k, 0, 0));
    }
    private static int helper(int[] nums, int k, int i, int sum) {
    if (i == nums.length) {
        return sum == k ? 1 : 0;
    }

    return helper(nums, k, i+1, sum + nums[i]) +
           helper(nums, k, i+1, sum);
}

}
