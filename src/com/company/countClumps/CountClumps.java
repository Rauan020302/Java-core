package com.company.countClumps;

public class CountClumps {
    public int countClumps(int[] nums){
        int clumps = 0;
        boolean isClump = false;
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(isClump)
            {
                if(nums[i] != nums[i+1])
                    isClump = false;
            }
            else if(nums[i] == nums[i+1])
            {
                isClump = true;
                clumps++;
            }
        }
        return clumps;
    }
}
