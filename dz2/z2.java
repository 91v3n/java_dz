package dz2;
import java.util.*;
import java.io.*;

public class z2 {
    public static void main(String[] args) throws IOException {
        FileWriter wr = new FileWriter("dz2/log.txt", true);
        System.out.println("1 - Сумма");
        System.out.println("2 - Разность");
        System.out.println("3 - Произведение");
        System.out.println("4 - Частное");
        Scanner in = new Scanner(System.in);
        int op = in.nextInt();
        System.out.println("Введите число 1");
        double fir = in.nextDouble();
        System.out.println("Введите число 2");
        double sec = in.nextDouble();
        double res;
        if (op==1){
            res = fir+sec;
            System.out.println("Сумма " + (res));
            wr.write(fir + " + " + sec + " = " + res + "\n");
        }
        if (op==2){
            res = fir-sec;
            System.out.println("Разность " + (res));
            wr.write(fir + " - " + sec + " = " + res + "\n");
        }
        if (op==3){
            res = fir*sec;
            System.out.println("Произведение " + (res));
            wr.write(fir + " * " + sec + " = " + res + "\n");
        }
        if (op==4){
            res = fir/sec;
            System.out.println("Частное " + (res));
            wr.write(fir + " : " + sec + " = " + res + "\n");
        }
        wr.flush();
    }
}
