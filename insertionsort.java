package sorting;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,5};
        insertionsort1(arr);
    }
    static void insertionsort1(int arr[]){
        for(int i = 1 ; i < arr.length ; i++){
            int temp = arr[i];
            int j = i - 1;
            while ( j >=0 && temp < arr[j]  ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
