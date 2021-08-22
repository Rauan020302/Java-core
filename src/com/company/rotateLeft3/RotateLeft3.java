package com.company.rotateLeft3;

public class RotateLeft3 {
    public int[] rotateLeft3 (int[] nums){
        int[] result = new int[3];
        if (nums.length ==3){
            result[0] = nums[1];
            result[1] = nums[2];
            result[2] = nums[0];
        }
        return result;
    }
}
