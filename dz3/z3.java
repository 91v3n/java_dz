package dz3;
import java.util.*;
public class z3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,10,6,33,8,25,40,9,60,0);
        System.out.println("Максимальное число " + Collections.max(list));
        System.out.println("Минимальное число " + Collections.min(list));
        System.out.println("Среднее число " + list.stream().mapToDouble(i->i).average().getAsDouble());
    }
}
