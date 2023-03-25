import java.util.Scanner;
public class function {


//    public static void printHelloWorld(){
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//    return ;
//    }




    //syntax with parameter
//    public static int calculateSum(int a, int b) {
//        int sum = a + b;
//        return sum;
//    }




   // product of a and b
//    public static  int Product(int a, int b){
//        int mul = a*b;
//        return mul;
//    }





    //swap
//    public static void swap(int e, int f) {
//        int temp = e;
//        e = f;
//        f = temp;
//        System.out.println("e= " + e);
//        System.out.println("f= " + f);
//        return;
//    }




    //factorial of a no.
//    public static int factorial(int a) {
//        int f= 1;
//        for (int i = 1; i<=a; i++) {
//        f= f*i;
//        }
//        return f;
//    }




//    public static void binToDec(int binNum){
//        int myNum = binNum;
//        int pow = 0;
//        int decNum = 0;
//        while (binNum>0){
//            int lastDigit = binNum%10;
//            decNum =decNum+(lastDigit*(int)Math.pow(2,pow));
//            pow++;
//            binNum =binNum/10;
//        }
//        System.out.println("decimal of " + myNum +" ="+ decNum);
//    }




//    //decToBinary
//    public static void decToBin(int decNum){
//        int myNum = decNum;
//        int pow = 0;
//        int binNum = 0;
//        while(decNum >0){
//            int rem = decNum%2;
//            binNum =binNum + (rem * (int)Math.pow(10,pow));
//            pow++;
//            decNum = decNum/2;
//        }
//        System.out.println("binary form of "+myNum +" ="+binNum);
//    }




//    //average of two no.
//    public static int average(int a, int b, int c){
//        int y =(a+b+c)/3;
//        System.out.println("average of "+a+" "+b+ " "+c+" "+"is "+y);
//        return y;
//    }



    //to check the no. is even
//    public static boolean isEven(int a){
//        if(a%2== 0){
//            System.out.println("no. is even");
//            return true;
//        }
//        System.out.println("no. is odd");
//        return false;
//    }




    //check no. is palindrome or not
//    public static boolean isPalindrome(int number) {
//        int reverse = 0;
//        while (number!=0) {
//            int remainder = number% 10;
//            reverse = reverse *10 + remainder;
//            number= number/10;
//        }
//       if(number==reverse){
//           System.out.println("palindrome");
//           return true;
//       }
//        System.out.println("not palindrome");
//       return false;
//    }




//    //sum of all digit
//    public static  int sumOfDigit(int a){
//        int sum =0;
//        while (a!=0){
//            int lastdigit =a%10;
//            sum =sum+lastdigit;
//            a=a/10;
//        }
//        System.out.println("sum of all digit is "+ sum);
//        return sum;
//    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

//        printHelloWorld();


//        System.out.println("enter a");
//        int a = sc.nextInt();
//        System.out.println("enter b");
//        int b = sc.nextInt();
//        System.out.println("sum is "+calculateSum(a,b));


//        System.out.println("enter a");
//        int a = sc.nextInt();
//        System.out.println("enter b");
//        int b = sc.nextInt();
//        System.out.println("product is " +Product(a,b));


//              swap(5,6);



//        System.out.println("a ?");
//        int a= sc.nextInt();
//        System.out.println("factorial is "+factorial(a) );



//        binToDec(101) ;



//        decToBin(7);



//        average(3,5,6);



//        isEven(57);



//        isPalindrome(981);



//        sumOfDigit(76);
    }
}
