package leetcode;

import java.util.Arrays;

/*
169. Majority Element

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2,2};
        int count = 0;
        int majority = 0;
        for(int i = 0; i<nums.length; i++ ){
         if(count == 0 && majority!= nums[i]){
             majority = nums[i];
             count = 1;
         }else if(majority == nums[i]){
             count++;
         }else{
             count --;
         }
        }
        System.out.println(majority);
    }
}
