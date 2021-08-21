package com.company.midThree;

public class MidThree {
    public int[] midThree(int[] nums){
        int[] result = new int[3];

        if (nums.length > 2 && nums.length % 2 == 1){
            int mid = nums.length /2;
            result[0] = nums[mid -1];
            result[1] = nums[mid];
            result[2] = nums[mid +1];
        }
        return result;
    }
}
