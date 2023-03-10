package dz4;

import java.util.*;

public class z1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("вася");
        ll.add("петя");
        ll.add("маша");
        ll.add("катя");
        ll.add("ваня");
        ll.add("жора");
        System.out.println(ll);

        for (int i = ll.size()-1; i >= 0; i--){
            ll.add(ll.get(i));
            ll.remove(i);
        }
        System.out.println(ll);
    }
}
