package sorting;

import java.util.Arrays;
import java.util.Collections;

public class inbuiltsort {
    public static void main(String[] args) {
        int arr[] = {2,3,1,7,5,6};
        int arr1[] = {2,3,1,7,5,10,11,8,9};
        Integer arr2[] = {2,3,1,7,5,6,9};
        Integer arr3[] = {2,3,1,7,5,6,9};
        inbuiltsort1(arr1);
        inbuiltsort2(arr,0,3);
        inbuiltsort3(arr2,0,5);
        inbuiltsort4(arr3);
    }
    static void inbuiltsort1(int arr[]){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void inbuiltsort2(int arr[],int start ,int end){
        Arrays.sort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }

    // for descending order
    static void inbuiltsort3(Integer arr[],int start , int end){
        Arrays.sort(arr,start,end,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
    static void inbuiltsort4(Integer arr[]){
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
