package sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,5};
        bubblesort1(arr);
    }
    static void bubblesort1(int arr[]){
        for (int i = 0 ; i < arr.length - 1 ; i++){
            for (int j = 0 ; j < arr.length - 1 - i ; i++){
                if(arr[j+1]  < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
