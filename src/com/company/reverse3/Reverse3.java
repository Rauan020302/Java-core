package com.company.reverse3;

public class Reverse3 {
    public int[] reverse3(int[] nums){
        int[] result = new int[nums.length];
        if (nums.length == 3){
            result[0] = nums[2];
            result[1] = nums[1];
            result[2] = nums[0];
        }
        return result;
    }
}
