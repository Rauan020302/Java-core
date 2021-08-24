package com.company.shiftLeft;

public class ShiftLeft {
    public int[] shiftLeft(int[] nums){
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length-1;i++){
            result[i] = result[i] + nums[i+1];
        }
        result[nums.length-1] = nums[0];
        return result;
    }

}
