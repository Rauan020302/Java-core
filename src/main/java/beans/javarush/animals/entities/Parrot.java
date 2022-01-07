package beans.javarush.animals.entities;

import org.springframework.stereotype.Component;

public class Parrot {
    private String name = "Parrot";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
