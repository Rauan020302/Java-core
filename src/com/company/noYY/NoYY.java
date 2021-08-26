package com.company.noYY;

import java.util.List;

public class NoYY {
    public List<String> noYY(List<String> strings){
        strings.removeIf(n -> n.contains("y"));

        strings.replaceAll(n -> n + "y");
        return strings;
    }
}
