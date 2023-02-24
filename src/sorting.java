import java.util.Arrays;
import java.util.Collections;

public class sorting {

    //bubble sort
    public static void bubble_sort(int arr[]){
        for (int i=0 ;i< arr.length-1;i++){
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    public static void print_array(int arr[]){
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    //selection sort
    public static void selection_sort(int arr[]){
for (int i=0;i< arr.length-1;i++){
    int minPos =i;
    for (int j=i+1;j< arr.length-1;j++){
        if (arr[minPos]>arr[j]){
            minPos=j;
        }
    }
    //swap
    int temp =arr[minPos];
    arr[minPos]= arr[i];
    arr[i]=temp;
}
    }


    //insersion sort
    public static void insersion_sort(int arr[]){
        for (int i=1;i< arr.length;i++){
            int curr=i;
            int prev=i-1;

            while(prev>=0 && arr[prev]>arr[curr]){
                arr [prev+1] =arr[prev];
                prev--;
            }
            //insersion
            arr[prev+1]=arr[curr];
        }
    }

//counting sort
    public static void counnting_sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i< arr.length-1; i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i< count.length;i++){
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }


    //bubble
    public static void bubble_decending(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j< arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                }
            }
        }
    }

    //selection
    public static void selection_decreasing(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int max=i;
            for (int j=i+1;j< arr.length-1;j++){
                if(arr[max]<arr[j]){
                    max=j;
                }
            }
            //swap
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
        }
    }

    //insertion
    public static void insertion_decreasing(int arr[]){
        for (int i=1;i< arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    //counting
    public static void counting_decreasing(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
        public static void main(String[] args) {
int arr[]= {1,2,8,7,6,5};
        //bubble sort
//bubble_sort(arr);
//        print_array(arr);

        //selection sort
//selection_sort(arr);
//        print_array(arr);

//        insersion_sort(arr);
//        print_array(arr);


            //inbuilt sort
//            Arrays.sort(arr);
//            print_array(arr);

//            Arrays.sort(arr, Collections.reverseOrder());
//            print_array(arr);


            //counting sort
//            counnting_sort(arr);
//            print_array(arr);


//            Integer que[]={3,6,2,1,8,7,4,5,3,1};
            int que[]={3,6,2,1,8,7,4,5,3,1};

            bubble_decending(que);
            print_array(que);

            selection_decreasing(que);
            print_array(que);

//            Arrays.sort(que,Collections.reverseOrder());
//            print_array(que);

            insertion_decreasing(que);
            print_array(que);

            counting_decreasing(que);
            print_array(que);
    }
}
