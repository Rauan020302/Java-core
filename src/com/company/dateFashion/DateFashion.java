package com.company.dateFashion;

public class DateFashion {
    public int dateFashion(int you, int date){
        if (you > 8 || date > 8){
            return 2;
        }
        if (you < 3 || date < 3){
            return 0;
        }return 1;
    }
}
