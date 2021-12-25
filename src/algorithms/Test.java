package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < 55; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.get(24));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(12);

        for (Integer n:list) {
            System.out.println(n);
        }
        list = new LinkedList<>(list);

        System.out.println(list);
        for (int i = 10; i < 20; i++) {
            list.remove(i);
        }
        System.out.println(list);

    }
}
