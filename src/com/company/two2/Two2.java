package com.company.two2;

import java.util.List;

public class Two2 {
    public List<Integer> two2(List<Integer> nums){
        nums.removeIf(n -> (n*2) % 10  == 2);
        nums.replaceAll(n -> n*2);
        return nums;
    }
}
