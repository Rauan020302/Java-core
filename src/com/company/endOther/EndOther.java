package com.company.endOther;

public class EndOther {
    public boolean endOther(String a, String b){
        b  = b.toLowerCase();
        a = a.toLowerCase();
        int aCount = a.length();
        int bCount = b.length();
        if (aCount < bCount) {
            String temp = b.substring(bCount - aCount, bCount);

            if (temp.compareTo(a) == 0)
                return true;
            else
                return false;
            } else {
            String temp = a.substring(aCount - bCount, aCount);

            if (temp.compareTo(b) == 0)
                return true;
            else
                return false;
        }

    }
}
