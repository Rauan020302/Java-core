package com.company.fizzString;

public class FizzString {
    public String fizzString(String str){
        if (str.charAt(0) == 'f' && str.charAt(str.length()-1) == 'b'){
            return "FizzBuzz";

        }
        if (str.charAt(0) == 'f'){
            return "Fizz";
        }
        return "Buzz";

    }
}
