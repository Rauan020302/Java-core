package com.company.roundSum;

public class RoundSum {
    public int roundSum(int a, int b, int c){
        int aSum = round10(a);
        int bSum = round10(b);
        int cSum = round10(c);
        return aSum + bSum + cSum;
    }
    public int round10(int num){
        int result = 0;
        if (num % 10 < 5){
            result = (num /10) * 10;
        }
        if (num % 10 > 5){
            num = num + 5;
            result = (num / 10);
            result *= 10;
        }
        return result;
    }
}
