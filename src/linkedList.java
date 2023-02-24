import java.util.LinkedList;

public class linkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add in linked list

    //add first
    public void addFirst(int data){
        //step 1-->create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2-->newNode next =head
        newNode.next=head;
        //step 3-->head=newNode
        head=newNode;
    }

    //add last
    public void addLast(int data){
        //step 1-->create new node
        Node newNode=new Node(data);
        size++;
        if(tail==null){
            tail=head=newNode;
            return;
        }
        //step 2-->newNode next =tail
        tail.next=newNode;
        //step 3-->tail=newNode
        tail=newNode;
    }

    //print
    public void print(){
        if (head==null){
            System.out.println("null");
            return;
        }
        Node temp=head;
        while ((temp!=null)){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //add in middle
    public void addMiddle(int data,int index){
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        }
        else if (size==1) {
            int val= head.data;;
            head=tail=null;
            size=0;
            return  val;
        }
        int val= head.data;
        head=head.next;
        size--;
        return val;
    }


    public int removeLast(){
        if (size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
      Node prev=head;
        for (int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val= tail.data;
        tail=prev;
        prev.next=null;
        size--;
        return val;
    }

    public void search(int key){
        int i=0;
        Node temp=head;
        while (temp!=null){
            if(temp.data==key){
                System.out.println("key is at "+i);
            }
            i++;
            temp=temp.next;
        }
    }

public int helper(Node head,int key ){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if (idx==-1){
            return -1;
        }
        return idx+1;
}
public int recSearch(int key){
        return helper(head, key);
}

public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
}

public void deleteNthfromEnd(int n){
        int size=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        if (n==size){
            head=head.next;
            return;
        }
        int idx=1;
        int idxToFind=size-n;
        Node prev=head;
        while (idx<idxToFind){
            prev=prev.next;
            idx++;
        }
        prev.next=prev.next.next;
        return;
}

public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
}
public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
       //step 1-->find mid
       Node midNode=findMid(head);
       //step 2-->reverse 2nd half
       Node prev=null;
       Node curr=midNode;
       Node next;
       while(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       Node right=prev;
       Node left=head;
      //step 3-->check left half & right half for palindrome
      while (right!=null){

          if (left.data!=right.data){
              return false;
          }
          left=left.next;
          right=right.next;
      }
      return true;
}

//floyd cycle finding algorithm
    public static boolean iscycle(){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    //remove a cycle in a linked list
    //detect cycle
    //slow=head
    //prev=null
    //slow-->+1
    //fast-->+1
    //prev=fast
    //prev.next=null
    public static void removecycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if (cycle==false){
            return;
        }
        //find meeting point
        slow=head;
        Node prev =null;
        while (slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle
        prev.next=null;

    }


//    private Node getMid(Node head){
//        Node slow=head;
//        Node fast=head.next;
//        while (fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        return slow;
//    }
//    private Node merge(Node head1, Node head2){
//        Node mergedLL=new Node(-1);
//        Node temp=mergedLL;
//        while (head1!=null && head2!=null){
//            if(head1.data<=head2.data){
//                temp.next=head1;
//                head1=head1.next;
//                temp=temp.next;
//            }
//            else {
//                temp.next=head2;
//                head2=head2.next;
//                temp=temp.next;
//            }
//        }
//        while (head1!=null){
//            temp.next=head1;
//            head1=head1.next;
//            temp=temp.next;
//        }
//        while (head2!=null){
//            temp.next=head2;
//            head2=head2.next;
//            temp=temp.next;
//        }
//        return mergedLL.next;
//    }
//public Node mergeSort(Node head){
//        if(head==null || head.next==null){
//            return head;
//        }
//        //find mid
//    Node mid= getMid(head);
//    //left & right ms
//    Node rightHead=mid.next;
//    mid.next=null;
//    Node newleft=mergeSort(head);
//    Node newright=mergeSort(rightHead);
//    //merge
//    return merge(newleft,newright);
//}



    //zigzag linkedlist
    public  void zigzag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reverse second half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL, nextR;
        while (left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }
    }


    public static void main(String[] args) {
        linkedList ll=new linkedList();

        ll.print();
        //add first
        ll.addFirst(2);
        ll.print();
        ll.addFirst(7);
        ll.print();
        ll.addFirst(5);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(8);
        ll.print();
        //add last
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addMiddle(4,2);
        ll.print();
        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        ll.search(3);

        System.out.println(ll.recSearch(3));

        ll.print();
        ll.reverse();
        ll.print();

        ll.deleteNthfromEnd(4);
        ll.print();

        System.out.println(ll.checkPalindrome());

        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=temp;


        System.out.println(iscycle());

        removecycle();
        System.out.println(iscycle());


        LinkedList<Integer> n=new LinkedList<>();
        //add
        n.addFirst(1);
        n.addFirst(2);
        n.addFirst(3);
        n.addLast(4);
        n.addLast(5);
        n.addLast(6);
        System.out.println(n);
        //remove
        n.removeLast();
        n.removeFirst();
        System.out.println(n);


//        LinkedList mm=new LinkedList();
//        mm.addFirst(1);
//        mm.addFirst(3);
//        mm.addFirst(2);
//        mm.addFirst(5);
//
//        mm.print();
//        mm.head=mm.mergeSort(mm.head);
//        mm.print();

ll.print();
ll.zigzag();
ll.print();
    }
}
