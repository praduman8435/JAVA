public class operators {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        //binary operator
        System.out.println("add-->"+(a+b));
        System.out.println("subtact-->"+(a-b));
        System.out.println("multiply-->"+(a*b));
        System.out.println("divide-->"+(a/b));
        System.out.println("module-->"+(a%b));

        //unary operator
        int r= a++; //post increment
        System.out.println(r);
        int e= b--; //post decrement
        System.out.println(e);
        int w= ++a; //pre increment
        System.out.println(w);
        int u= --b; //pre decrement
        System.out.println(u);

        //relational operators
        // = =
        // ! =
        // >
        // <
        // > =
        // < =

        //logical operators
        // && -->hum tabhi true jb dono true
        // || -->hum tabhi false jb dono false
        // !  -->not statement

        //Assignment operators
        a+= 3; //-->a=a+3
        System.out.println(a);
        a-= 4; //-->a=a-4
        System.out.println(a);
        a/= 2; //-->a=a/2
        System.out.println(a);
        a*= 4; //-->a=a*4
        System.out.println(a);
    }
}
