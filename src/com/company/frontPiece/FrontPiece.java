package com.company.frontPiece;

public class FrontPiece {
    public int[] frontPiece(int[] nums){
        int[] result = new int[2];
        if (nums.length > 1){
            result[0] = nums[0];
            result[1] = nums[1];
        }
        return result;
    }
}
