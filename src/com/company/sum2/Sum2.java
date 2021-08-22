package com.company.sum2;

public class Sum2 {
    public int sum2(int[] nums){
        if (nums.length >= 2){
            return nums[0] + nums[1];
        }
        return nums[0];

    }
}
