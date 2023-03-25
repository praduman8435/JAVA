import java.util.LinkedList;

public class frameworkLinklist {


    public static void main(String[] args) {
        //ll framework
        //create
        LinkedList<Integer>ll=new LinkedList<>();
        //add
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
