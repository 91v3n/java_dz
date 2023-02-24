package dz3;

import java.util.*;

public class z2 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(rand.nextInt(1,100));
        }
        System.out.println(list.toString());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;                                        // откат к предыдущему элементу после удаления
            }
        }
        System.out.println(list.toString());
    }

}
