package com.company.makeMiddle;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums){
        int[] result = new int[2];
        if (nums.length >= 2 && nums.length % 2 == 0){
            int mid = nums.length / 2;
            result[0] = nums[mid - 1];
            result[1] = nums[mid];
        }
        return result;
    }
}
