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
        int[] res = new int[fir.length + sec.length];
        for (int k = 0, i = 0, j = 0; k < res.length; k++)
            res[k] = i < fir.length && (j == sec.length || fir[i] < sec[j]) ? fir[i++] : sec[j++];
        return res; 
    }
}