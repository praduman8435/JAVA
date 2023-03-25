import java.util.*;
public class strings {

    //to print letter in  string
    public static void print_letters(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }


    //to check if a string is palindrome
    public static boolean isPalindrome(String str){
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("not a palindrome");
                return false;
            }
        }
        System.out.println("it's a palindrome");
        return true;
    }


    //question
    public static float sortest_path(String str){
        int x=0;
        int y=0;
        for (int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            if(dir=='S'){
                y--;
            } else if (dir=='N') {
                y++;
            } else if (dir=='W') {
                x--;
            }
else {
    x++;
            }
        }
        int x2= x*x;
        int y2= y*y;
        return (float) Math.sqrt( x2 + y2);
    }


//substrings
    public static String substring(String str, int si, int ei){
        String substr ="";
        for (int i=si;i<ei;i++){
            substr+= str.charAt(i);
        }
        return substr;
    }

    //question-->converting each first letter of each word to uppercase
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }


    //question--> string compression
    public static String compress(String str){
        String newStr ="";
        for (int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr +=str.charAt(i);
            if (count>1){
                newStr += count.toString();
            }
        }
        return newStr;
    }



    public static void main(String[] args) {
//        char arr[] ={'a','b','c','d'};
//        String str = "abcd";
//        String str2 = new String("xyz");

//        Scanner sc = new Scanner(System.in);
//        String name;
//        System.out.println("your name?");

        //this will print first name only
//        name = sc.next();
//        System.out.println("name is "+name);

        //this will print full name
//        name = sc.nextLine();
//        System.out.println("name is "+name);

        //length of string
//        String fullname = "praduman prajapati";
//        System.out.println(fullname.length());


//        concatanation
        String firstname = "praduman";
        String lastname = "prajapati";
        String fullname = firstname+" "+lastname;
//        System.out.println(fullname);

        //to find character position
//        System.out.println(fullname.charAt(0));
//        System.out.println(fullname.charAt(5));

        //print all letters
//        print_letters(fullname);

        //to check palindrome
//        String str ="moom";
//        isPalindrome(firstname);
//        isPalindrome(str);


        //get_shortest_path
//        String re="WNEENESENNN";
//        System.out.println(sortest_path(re));


// compare
//            String s1 = "tony";
//            String s2 = "tony";
//            String s3 = new String("tony");
//            if (s1.equals(s3)) {
//                System.out.println("Strings are equal");
//            } else{
//                System.out.println("Strings are not equal");
//            }

        //substring
//String str = "HelloWorld";
//already exist
//        System.out.println(str.substring(0,5));
//        System.out.println(substring(str,0,5));

        //printing the largest string
        //str1.compareTo(str2)-->treat A & a differently
        //str1.compareToIgnoreCase(str2)-->treat a & A as same
        //0: equals
        //<0: str1<str2
        //>0: str1>str2
//        String fruits[] ={"apple","mango","banana"};
//        String largest = fruits[0];
//        for (int i=1;i<fruits.length;i++){
//           if( largest.compareTo(fruits[i])<0){
//               largest=fruits[i];
//           }
//        }
//        System.out.println(largest);


        //string builder
//        StringBuilder sb = new StringBuilder("");
//        for (char ch='a'; ch<='z'; ch++){
//            sb.append(ch);
//        }
//        System.out.println(sb);

        //first letter to uppercase
//        String str ="hi, i am praduman";
//        System.out.println(toUpperCase(str));

//        String str = "aaaaredfrre";
//        System.out.println(compress(str));


        //question-->counting no.of times vowel occured
//        String str =new Scanner(System.in).next();
//        int count =0;
//        for (int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//                count++;
//            }
//        }
//        System.out.println("count of vowel is :"+count);


    }
}
