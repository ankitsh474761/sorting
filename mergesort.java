package divideandconquer;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergesort1(arr,0,arr.length-1);
        printarr(arr);

    }
    static void printarr(int arr[]){
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void mergesort1(int arr[],int si ,int ei){
        if(si >= ei)
            return;

        int mid = si+ (ei-si)/ 2;// write it carefully
        mergesort1(arr,si,mid);//left part
        mergesort1(arr,mid+1,ei);//right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;//iterator for left part
        int j = mid +1;//iterator for right part
        int k = 0; //iterator for temp arr

        while (i <= mid && j <=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else {
                temp[k] = arr[j];
               j++;
               k++;
            }
        }

        //left part
        while (i <= mid){
            temp[k++]= arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy items to original arr
        for (k = 0 , i  = si; k < temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }
}
