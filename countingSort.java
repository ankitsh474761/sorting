package sorting;

import java.util.Arrays;

public class countingSort {
    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort1(arr);
    }

    static void countingSort1(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int count[] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0 ;

        for (int i = 0; i < arr.length; i++) {
            while ( count[i] > 0) {
                arr[j] = i ;
                j++;
                count[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
