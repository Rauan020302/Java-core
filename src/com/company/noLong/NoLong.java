package com.company.noLong;

import java.util.List;

public class NoLong {
    public List<String> noLong(List<String> strings){
        strings.removeIf(n -> n.length()>3);
        return strings;
    }
}
