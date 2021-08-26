package com.company.noNeg;

import java.util.List;

public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums){
        nums.removeIf(n -> n < 0);
        return nums;
    }
}
