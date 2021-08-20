package com.company.endsLy;

public class EndsLy {
    public boolean endsLy(String str){
        for (int i = 0; i < str.length() - 1; i++){
            int length = str.length()- 2;
            String result = str.substring(length);
            if (result.equals("ly")){
                return true;
            }
        }
        return false;
    }
}
