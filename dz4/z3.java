package dz4;
import java.util.*;

public class z3 {
    public static void main(String[] args) {
        boolean quest = true;
        Scanner in = new Scanner(System.in);
        int op = 0;
        int yn = 0;
        while (quest) {
            System.out.println("1 - Сумма");
            System.out.println("2 - Разность");
            System.out.println("3 - Произведение");
            System.out.println("4 - Частное");
            op = in.nextInt();
            System.out.println("Хотите продолжить или отменить? 0 - для продолжения");
            yn = in.nextInt();
            if (yn==0){quest = false;}
        }
        System.out.println("Введите число 1");
        double fir = in.nextDouble();
        System.out.println("Введите число 2");
        double sec = in.nextDouble();
        if (op==1){System.out.println("Сумма " + (fir+sec));}
        if (op==2){System.out.println("Разность " + (fir-sec));}
        if (op==3){System.out.println("Произведение " + (fir*sec));}
        if (op==4){System.out.println("Частное " + (fir/sec));}
    }
}