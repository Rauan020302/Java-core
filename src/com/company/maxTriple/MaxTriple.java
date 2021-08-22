package com.company.maxTriple;

public class MaxTriple {
    public int maxTriple(int[] nums){
        int result = nums[0];
        if (result < nums[nums.length/2])
            result = nums[nums.length/2];
        if (result < nums[nums.length-1])
            result = nums[nums.length-1];
        return result;

    }
}
