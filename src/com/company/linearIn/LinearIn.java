package com.company.linearIn;

public class LinearIn {
    public boolean linearIn(int[] outer, int[] inner){
        boolean notFound;
        for(int inI = 0, outI = 0; inI < inner.length; inI++)
        {
            notFound = true;
            for(; outI < outer.length && notFound; outI++)
            {
                if(inner[inI] == outer[outI])
                    notFound = false;
            }
            if(notFound)
                return false;
        }
        return true;
    }
}
