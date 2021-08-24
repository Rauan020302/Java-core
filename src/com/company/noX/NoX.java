package com.company.noX;

import java.util.List;

public class NoX {
    public List<String> noX(List<String> strings){
        strings.replaceAll(n -> n.replace("x","") );
        return strings;
    }
}
