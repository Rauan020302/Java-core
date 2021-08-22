package com.company.maxEnd3;

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums){
        int[] result = new int[3];
        if (nums.length == 3){
            if (nums[0] > nums[2]){
                int a = nums[0];
                result[0] = a;
                result[1] = a;
                result[2] = a;
            }
            if (nums[0] < nums[2]){
                int a = nums[2];
                result[0] = a;
                result[1] = a;
                result[2] = a;
            }
            if (nums[0] == nums[2]){
                int a = nums[2];
                result[0] = a;
                result[1] = a;
                result[2] = a;
            }
        }
        return result;
    }
}
