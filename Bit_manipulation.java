import java.util.*;
public class bit_manupulation {
    public static void oddOrEven(int n){
        int bitmask =1;
        if ((n&bitmask) ==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }


    //get Ith bit
    public static int getIthBit(int n, int i){
        int bitMask =1<<i;
        if((n&bitMask)==0){
            return 0;
        }else {
            return 1;
        }
    }


    //set Ith bit
    public static int setIthbit(int n,int i){
        int bitMask =1<<i;
        return n|bitMask;
    }


    //clear Ith bit
    public static int clearIthBit(int n, int i){
        int bitMask =~(1<<i);
        return n&bitMask;
    }


    //update Ith Bit
    public static int updateIthBit(int n,int i,int newBit){
        if (newBit==0){
            return clearIthBit(n,i);
        }else {
            return setIthbit(n,i);
        }
    }


    //clear Ith Bit
    public static int clearIBit(int n, int i){
        int bitMask =(~0)<<i;
        return n&bitMask;
    }


    //clear range of Ith Bit
    public static int clearRangeOfBit(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }

    //check if a number is a power of 2 or not
    public static boolean isPowerOfTwo(int n){
    return (n&(n-1))==0;
    }

    //count set bits in a number
    public static int countSetBit(int n){
       int count =0;
       while (n>0){
           if ((n&1)!=0){
               count++;
           }
          n= n>>1;
       }
       return count;
    }

    //fast exponentiation
    public static int fastExpo(int a,int n){
        int ans =1;
        while (n>0){
            if((n&1)!=0){
                ans =ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {

        //binary and
        System.out.println(0&1);
        System.out.println(5&6);
        //hum tabhi false jb dono false

        //binary or
        System.out.println(0|0);
        System.out.println(4|3);
        //hum tabhi true jb dono true

        //binary xor
        System.out.println(4^6);
        System.out.println(0^1);
        //jb hum same tb hum false

        //binary one's complement
        System.out.println(~5);
        //convert 0-->1 & 1-->0

        //binary left shift
        //a<<b== a*2^b
        System.out.println(5<<2);


        //binary right shift
        //a>>b==a/2^b
        System.out.println(5>>2);

        //if a no. in binary is even then its right significant bit 0
        //if a no. in binary is odd then its right significant bit 1
        oddOrEven(3);
        oddOrEven(5);
        oddOrEven(4);


        System.out.println(getIthBit(10,2));

        System.out.println(setIthbit(10,2));

        System.out.println(clearIthBit(10,3));

        System.out.println(updateIthBit(10,2,1));

        System.out.println(clearIBit(15,2));

        System.out.println(clearRangeOfBit(10,2,4));

        System.out.println(isPowerOfTwo(4));

        System.out.println(countSetBit(10));

        System.out.println(fastExpo(3,5));
    }
}
