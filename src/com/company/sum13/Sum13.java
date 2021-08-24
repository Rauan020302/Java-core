package com.company.sum13;

public class Sum13 {
    public int sum13(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 13) {
                count = count + nums[i];

                if (i > 0 && nums[i - 1] == 13) {
                    count = count - nums[i];
                }
            }
        }
        return count;
    }
}
