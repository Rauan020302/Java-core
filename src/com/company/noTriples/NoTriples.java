package com.company.noTriples;

public class NoTriples {
    public boolean noTriples(int[] nums){
        String result = "";
        for (int i = 0; i < nums.length - 3; i++){
            if (nums[i] == nums[i+1] && nums[i+1]== nums[i+2]){
                return true;
            }
        }
        return false;
    }
}
