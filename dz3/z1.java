package dz3;
import java.util.*;
public class z1 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 12, 35, 1, 4, 10, 3, 5};
        System.out.println(Arrays.toString(split(arr)));
    }
    public static int[] split(int[] arr) {
        if (arr.length <= 1) return arr;
        int[] fir = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] sec = Arrays.copyOfRange(arr, fir.length, arr.length);
        return join(split(fir), split(sec));
    }
    private static int[] join(int[] fir, int[] sec) {
        int i = 0, j = 0, k = 0;
        int[] res = new int[fir.length + sec.length];
        while (j < fir.length && k < sec.length)
            if (fir[j] < sec[k])
                res[i++] = fir[j++];
            else res[i++] = sec[k++];
        while (i < res.length)
            if (j != fir.length)
                res[i++] = fir[j++];
            else res[i++] = sec[k++];
        return res;
    }
}
