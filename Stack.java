import java.util.*;
public class StackB {

    //stack using arraylist
//            static class stack{
//                static ArrayList<Integer> list=new ArrayList<>();
//                public static boolean isEmpty(){
//                    return list.size()==0;
//                }
//
//                //push
//                public static void push(int data){
//                    list.add(data);
//                }
////                //pop
//                public static int pop(){
//                    if (isEmpty()){
//                        return -1;
//                    }
//                    int top=list.get(list.size()-1);
//                    list.remove(list.size()-1);
//                    return top;
//                }
////                //peek
//                public static int peek(){
//                    if (isEmpty()){
//                        return -1;
//                    }
//                   return list.get(list.size()-1);
//                }
//            }




    //stack using linkedlist
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    static class stack {
//        static Node head = null;
//
//        public static boolean isEmpty() {
//            return head == null;
//        }
//
//        //push
//        public static void push(int data) {
//            Node newNode = new Node(data);
//            if (isEmpty()) {
//                head = newNode;
//                return;
//            }
//            newNode.next = head;
//            head = newNode;
//        }
//
//        //pop
//        public static int pop() {
//            if (isEmpty()) {
//                return -1;
//            }
//            int top=head.data;
//            head=head.next;
//            return top;
//        }
//        //peek
//        public static int peek(){
//            if(isEmpty()){
//                return -1;
//            }
//            return head.data;
//        }
//    }



    //push at bottom
//    public static void pushAtBottom(Stack<Integer> s,int data){
//        if(s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int top=s.pop();
//        pushAtBottom(s,data);
//        s.push(top);
//    }


    //reverse a string using stack
//    public static String reverse(String str){
//        Stack<Character> s=new Stack<>();
//        int idx=0;
//        while (idx<str.length()){
//            s.push(str.charAt(idx));
//            idx++;
//        }
//                StringBuilder result=new StringBuilder("");
//        while (!s.isEmpty()){
//           char curr= s.pop();
//           result.append(curr);
//        }
//        return result.toString();
//    }




    //reverse a stack
    //push at bottom
//    public static void pushAtBottom(Stack<Integer> s,int data){
//        if(s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int top=s.pop();
//        pushAtBottom(s,data);
//        s.push(top);
//    }
//    public static void reverseStack(Stack<Integer> s){
//        if (s.isEmpty()){
//         return;
//        }
//        int top=s.pop();
//        reverseStack(s);
//        pushAtBottom(s,top);
//    }
//    public static void printStack(Stack<Integer> s){
//        while (!s.isEmpty()){
//            System.out.println(s.pop());
//        }
//    }



//stock span problem
    public static void stockSpan(int stock[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for (int i=0;i<stock.length;i++){
            int currPrice=stock[i];
            while (!s.isEmpty()&&currPrice>stock[s.peek()]){
                s.pop();
            }
            if (s.isEmpty()){
                span[i]=i+1;
            }
            else {
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }


    public static void main(String[] args) {

//push 0(1)
//pop 0(1)
//peek 0(1)

//implementation
//1-->array  2-->arraylist  3-->linkedlist


//        stack s=new stack();
//        s.push(1);
//        s.push(7);
//        s.push(3);
//        s.push(4);
//
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }



        //stack using framework
//        Stack<Integer> s =new Stack<>();
//        s.push(1);
//        s.push(7);
//        s.push(3);
//        s.push(4);
//        while (!s.isEmpty()) {
//            System.out.println(s.peek());
//            s.pop();
//        }

        //push at bottom
//        pushAtBottom(s,9);
//        while (!s.isEmpty()) {
//            System.out.println(s.peek());
//            s.pop();
//        }


        //reverse string
//        String m="abcd";
//        System.out.println(reverse(m));



//reverse a stack
//        Stack<Integer> s =new Stack<>();
//        s.push(1);
//        s.push(7);
//        s.push(3);
//        s.push(4);
//        reverseStack(s);
//        printStack(s);


        //stock span
        int stock[]= {100,80,60,70,60,85,100};
        int span[]=new int[stock.length];
        stockSpan(stock,span);
        for (int i=0;i< span.length;i++){
            System.out.println(span[i]+" ");
        }
        }
    }
