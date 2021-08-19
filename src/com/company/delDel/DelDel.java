package com.company.delDel;


public class DelDel {
    public String delDel(String str){
        if (str.substring(1, 4).equals("del")){
            return str.charAt(0) + str.substring(4);
        }else{
            return str;
        }
    }
}
