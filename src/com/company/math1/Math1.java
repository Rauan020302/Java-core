package com.company.math1;

import java.util.List;

public class Math1 {
    public List<Integer> math1(List<Integer> nums){
        nums.replaceAll(n-> n * 10 + 10);
        return nums;
    }
}
