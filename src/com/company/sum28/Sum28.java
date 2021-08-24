package com.company.sum28;

public class Sum28 {
    public boolean sum28(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (num == 2) {
                count++;
            }
        }
        return count == 4;
    }
}
