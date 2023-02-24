package dz1;
import java.util.*;

public class dz1 {
    public static void main(String[] args) {
        System.out.println("введи число");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum1 = 0;
        int sum2 = 1;
        for (int i = 1; i <= num; i++) {
            sum1 += i;
            sum2 *= i;

        }
        System.out.println("Треугольное число = " + sum1);
        System.out.println("Факториал числа = " + sum2);

    }
}
