package com.company.no14;

public class No14 {
    public boolean no14(int[] nums){
        for (int num : nums) {
            if (num == 1 && num == 4) {
                return false;
            }
        }
        return true;
    }
}
