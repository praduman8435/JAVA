public class doubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addfirst(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //print
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //remove
public int removefirst(){
        if (head==null){
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if (size==1){
            int val= head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
}
    public static void main(String[] args) {
       doubleLL dll=new doubleLL();
       dll.addfirst(3);
       dll.addfirst(2);
       dll.addfirst(5);
       dll.addfirst(6);

       dll.print();
        System.out.println(dll.size);

        dll.removefirst();
        dll.print();
        System.out.println(dll.size);
    }
}
