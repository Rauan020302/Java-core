package com.company.firstLast6;

public class FirstLast6 {
    public boolean firstLast6(int[] nums){
        if (nums.length > 1){
            if (nums[0] == 6){
                return true;
            }
            return nums[nums.length - 1] == 6;
        }
        return false;
    }
}
