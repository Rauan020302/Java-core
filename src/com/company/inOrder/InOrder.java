package com.company.inOrder;

public class InOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk){
        if (!bOk){
            if (b > a && c > b){
                return true;
            }
        }
        if (bOk){
            return c > b;
        }
        return false;
    }
}
