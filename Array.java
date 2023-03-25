import java.util.*;
public class Array {

    //creating an Update function
    public static void update(int n[]){
        for (int i=0;i<n.length;i++){
            n[i]= n[i]+20;       //update the Array elements by adding 20 to them
        }
    }


    //linear search function
    public static void linear_search(int a[], int key){
        for (int i=0;i<a.length;i++){
            if (a[i]==key) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("key is not presents");
    }


    //binary search function
    public static void binary_search(int a[], int key){
        int start=0;
        int end=a.length-1;
        int mid=(start+end)/2;
        while (start<=end){
            if (a[mid]==key){
                System.out.println("key is at "+mid);
                return;
            }
            else if (a[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    }


    //finding largest no. function
    public static void largest_no(int a[]){
        int num=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if(a[i]>num){
                num=a[i];
            }
        }
        System.out.println("largest value is "+num);
    }


    //Reverse an array function
    public static void reverse_array(int a[]){
        int start=0;
        int end=a.length-1;
        while (start<=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }





    public static void main(String[] args) {

//Array--> list of elements of the same type placed in a contiguous memory location

//creation of Array :---
//datatype arrayName[]= new datatype[size]
        int a[]= new int[5];     //this will creates an Array of size 5
        int b[]={1, 2, 3};       //this will creates an Array in which 1,2 & 3 are stored
        String fruits[]={"Mango", "Guava", "Banana"};       //this will create an Array in which mango,guava & banana are stored



//taking input in an Array
int n[]=new int[5];
Scanner sc=new Scanner(System.in);
       for (int i=0;i<n.length;i++) {
            System.out.println("Enter the elements");
            n[i] = sc.nextInt();
       }
//printing the Array
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();



//Passing arrays as arguments
//1.pass by value
//2.pass by reference
    int marks[]= {3,4,5,7};
    update(marks);                        //here we are updating marks by call by reference
       for (int i=0;i<marks.length;i++){
       System.out.print(marks[i]+" ");
       }
       System.out.println();              //use to move to the next line



//linear search
        int m[]={4,3,8,6,5,37,88,43};
        linear_search(m,5);
        linear_search(m,37);
        linear_search(m,57);



//binary search
        int o[]={4,3,8,6,5,37,88,43};
        binary_search(o,6);



//largest number
        int y[]={4,3,8,6,5,37,88,43};
        largest_no(y);



//reverse an Array
         int u[]={4,3,8,6,5,37,88,43};
         reverse_array(u);
    }
}
