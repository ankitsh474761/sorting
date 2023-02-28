package divideandconquer;

public class quickSort {
    public static void main(String[] args) {

        int arr[] ={6,3,9,8,2,5};
        quickSort1(arr,0,arr.length-1);
        printarr(arr);
    }

    static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void quickSort1(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        //last element
        int pidx = partition(arr,si,ei);
        //see notes for recursion
        quickSort1(arr , si ,pidx-1);  //left
        quickSort1(arr,pidx+1 , ei);   //right
    }

    static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si - 1;// to make place for ele smaller than pivot
        for (int j = 0; j <ei;j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // to replace pivot element with the last element or to place pivot element at right position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
}
