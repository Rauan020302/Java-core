package com.company.copies;

import java.util.List;

public class Copies {
    public List<String> copies3(List<String> strings){
        strings.replaceAll(n -> n+n+n);
        return strings;
    }
}
