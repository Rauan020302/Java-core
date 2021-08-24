package com.company.matchUp;

public class MatchUp {
    public int matchUp(int[] nums1,int[] nums2){
        int count = 0;
        if (nums1.length == nums2.length){
            for (int i = 0 ; i < nums1.length; i++){
                if (nums1[i] != nums2[i]){
                    count++;
                }
            }
        }
        return count;
    }
}
