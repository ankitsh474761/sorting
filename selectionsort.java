package sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,5};
        selectionsort1(arr);
    }
    static void selectionsort1(int arr[]){
        for (int i = 0 ; i  < arr.length - 1; i++){
            int min = i ;
            for (int j =  i + 1 ; j < arr.length ; j++){
                if(arr[min]  > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min] ;
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
