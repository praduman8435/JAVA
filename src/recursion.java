import java.util.*;
public class recursion {

    //print no. from n to 1(decreasing order)
    public static void print_dec(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        print_dec(n-1);
    }


    //print no. from n to 1(increasing order)
    public static void print_inc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        print_inc(n-1);
        System.out.print(n+" ");
    }


    //printing factorial
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }


//sum of first n natural no.
    public static int sum(int n){
        if(n==1){;
            return 1;
        }
        return n+sum(n-1);
    }


    //print nth fibonacci no.
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }


            //check if a given array is sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
       return isSorted(arr,i+1);
    }


    //first occurance of an element in an array
    public static int first_occ(int arr[], int key, int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
       return first_occ(arr,key,i+1);
    }


    //last occurance of an array
    public static int last_occ(int arr[], int key, int i){
        if(i== arr.length){
            return -1;
        }
        int isFound= last_occ(arr,key,i+1);
            if(isFound== -1 && arr[i]==key){
                return i;
            }
                return isFound;
    }


    //print x^n
    public static int x_power_n(int x,int n){
        if(n==0){
            return 1;
        }
        return x*x_power_n(x,n-1);
    }


    //optimised way to find x to power n
    public static int opt_x_power_n(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPower=opt_x_power_n(x,n/2);
     int halfPowerSquare= halfPower*halfPower;
     //n is odd
        if(n%2!=0){
            halfPowerSquare=x*halfPowerSquare;
        }
        return halfPowerSquare;
    }


    //tiling problem
    public static int tile_problem(int n){
        if(n==0 ||n==1){
            return 1;
        }
        //vertical choice
        int vertical_size=tile_problem(n-1);

        //horizontal_choice
        int horizontal_size=tile_problem(n-2);

         return vertical_size+horizontal_size;
    }


    //remove duplicates in a string
//public static void remove_duplicate(String str, int idx, StringBuilder newStr, boolean map){
//        if(idx==str.length()){
//            System.out.println(newStr);
//            return;
//        }
//        char curr_Char=str.charAt(idx);
//        if(map[curr_Char-'a']==true){
//            remove_duplicate(str, idx+1, newStr,map);
//        }
//        else {
//            map[curr_Char-'a']=true;
//            remove_duplicate(str, idx+1,newStr.append(curr_Char), map);
//        }
//    }


    //friends pairing problem
    public static int friendPairing(int n){
        if(n==1 ||n==2){
            return n;
        }
        return friendPairing(n-1)+(n-1)*friendPairing(n-2);
    }


    //binary string problem
    public static void printBinString(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinString(n-1,0,str+"0");
        if(lastplace==0){
            printBinString(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {

        print_dec(5);

        print_inc(5);

        System.out.println();

        System.out.println(factorial(5));

        System.out.println(sum(5));

        System.out.println(fibo(4));

        int arr[]= {1,5,6,7,5,8};
        System.out.println(isSorted(arr,0));

        System.out.println(first_occ(arr,5,0));

        System.out.println(last_occ(arr,5, 0));

        System.out.println(x_power_n(2,10));

        System.out.println(opt_x_power_n(2,10));

        System.out.println(tile_problem(4));

//        String str="aaapnnacolleege";
//        remove_duplicate(str, 0,new StringBuilder(""), new boolean[26]);

        System.out.println(friendPairing(3));

        printBinString(3,0, "");
    }
}
