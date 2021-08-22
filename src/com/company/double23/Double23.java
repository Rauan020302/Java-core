package com.company.double23;

public class Double23 {
    public boolean double23(int[] nums){
        if (nums.length == 2){
            if (nums[0] == nums[1]){
                return true;
            }
        }
        if (nums.length == 3){
            if (nums[0] == nums[1] && nums[1] == nums[2]){
                return true;
            }
        }
        if (nums.length == 1){
            return true;
        }
        return false;
    }
}
