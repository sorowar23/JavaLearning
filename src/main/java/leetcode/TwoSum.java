package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++)
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,7,5,9,6};
        int [] result = twoSum(nums, 15);
        System.out.println(Arrays.toString(result));
    }
}