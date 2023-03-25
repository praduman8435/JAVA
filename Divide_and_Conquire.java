import java.util.*;
public class divide_and_conquire {
    //merge sort
    public static void merge_sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        //kam
        int mid = si + (ei - si) / 2;
        merge_sort(arr, si, mid);//left
        merge_sort(arr, mid + 1, ei);//right
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;//iterator for left part
        int j = mid + 1;//iterator for right part
        int k = 0;//iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //remaining left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //remaining right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        //copy temp to new arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }


    //print
    public static void print(int arr[]){
    for(int i=0;i<arr.length-1;i++){
        System.out.print(i+" ");
    }
        System.out.println();
}
    public static void main(String[] args) {
        //merge sort
int arr[]={3,4,6,7,2,5};
merge_sort(arr,0,arr.length-1);
print(arr);
    }
}
