package week_1.HashmapsAndSets;

/**
 * SOLVED
 */
public class TwoSumSOLVED {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        //outer loop
        for(int n = 0; n < nums.length; n++) {
            //inner loop
            for(int x = n+1; x < nums.length; x++) {
                if(nums[n] + nums[x] == target) {
                    indices[0] = n;
                    indices[1] = x;
                }
            }
        }
        return indices;
    }
}
