package com.company.noZ;

import java.util.List;

public class NoZ {
    public List<String> noZ(List<String> strings){
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }
}
