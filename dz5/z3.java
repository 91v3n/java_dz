package dz5;

import java.util.Arrays;

public class z3 {
    
    public static void main(String[] args) {
        int[] array = { 7, 5, 1, 8, 3, 6, 9, 2, 4 };
        System.out.println("Исходный " + Arrays.toString(array));
        
        heapSort(array);
        System.out.println("Сортированный " + Arrays.toString(array));
    }
    
    public static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            hp(array, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            hp(array, i, 0);
        }
    }
    
    public static void hp(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            hp(array, n, largest);
        }
    }
}