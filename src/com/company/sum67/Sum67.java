package com.company.sum67;

public class Sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        int annul7=0;
        for (int i =0 ; i <nums.length;i++){
            if(nums[i] == 6){
                for( int j = i; nums[j] != 7;j++) {
                    nums[j] = 0;
                    annul7 = j;
                }
                nums[annul7+1] =0;
            }
            else
                sum += nums[i];
        }
        return sum;
    }
}
