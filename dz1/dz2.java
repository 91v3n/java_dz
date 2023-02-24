package dz1;

public class dz2 {
    public static void main(String[] args) {
        int num = 1000;
        System.out.println(2);
        for (int i = 3; i < num; i+=2) {
            boolean a = true;
            int s = (int) Math.sqrt(i);
            for (int j = 3; j <= s; j+=2) {
                if (i%j==0) {
                    a = false;
                    break;
                }
            }
            if (a) {System.out.println (i);}
        }
    }
}
