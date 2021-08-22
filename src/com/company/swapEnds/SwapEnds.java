package com.company.swapEnds;

public class SwapEnds {
    public int[] swapEnds(int[] nums){
        int a = nums[0];
        int b = nums[nums.length-1];
        nums[0] = b;
        nums[nums.length-1]= a;
        return nums;
    }
}
