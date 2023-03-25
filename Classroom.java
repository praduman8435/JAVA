import java.util.*;
public class classroom {

    //swap 2 no.
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }

    public static int containerWithMostWater(ArrayList<Integer>height){
        int storedWater=0;
        for (int i=0;i<height.size();i++){
            for (int j=i+1;j<height.size();j++) {
                int length = Math.min(height.get(i), height.get(j));
                int bredth = j - i;
                int currWater = length * bredth;
                storedWater = Math.max(currWater, storedWater);
            }
        }
        System.out.println("maxStoredWater is "+storedWater);
        return storedWater;
    }

    //another approach for storedWater
    public static int storedWater(ArrayList<Integer>height) {
        int storedwater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int length=Math.min(height.get(lp),height.get(rp));
            int breadth=rp-lp;
            int currWater=length*breadth;
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else {
                rp--;
            }
            storedwater=Math.max(storedwater,currWater);
        }
        System.out.println(storedwater);
        return storedwater;
    }

    //pairsum1
    public static boolean pairsum1(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if((list.get(i)+list.get(j))==target){
                    System.out.println("("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }

    //another approach to pairsum1
    public static boolean pairSum(ArrayList<Integer>list,int target){
        int lp=0;
        int rp=list.size()-1;
        while (lp!=rp){
            if(list.get(lp)+ list.get(rp)==target){
                System.out.println("("+lp+","+rp+")");
                return true;
            }
            else if (list.get(lp)+ list.get(rp)<target) {
                lp++;
            }
            else {
                rp--;
            }
        }
        return false;
    }


    //pair sum 2
    public static boolean pairSum2(ArrayList<Integer>list,int target){
        int bp=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++) {
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while (lp!=rp){
            if(list.get(lp)+ list.get(rp)==target){
//                System.out.println("("+lp+","+rp+")");
                return true;
            }
            else if (list.get(lp)+ list.get(rp)<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //java collection framework
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();

        //add element--o(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        //adding list--o(n)
        list1.add(1,9);

        System.out.println(list1);

        //get operation---o(1)
        int element=list1.get(2);
        System.out.println(element);

        //delete--o(n)
        list1.remove(2);
        System.out.println(list1);

        //set--o(n)
        list1.set(2,10);
        System.out.println(list1);

        //contains element--o(n)
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(8));



        //size of array list
        System.out.println(list1.size());

        //print arraylist
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        //print reverse of an array list
        for(int i=list1.size()-1;i>=0;i--){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        //find maximum in an array list
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<list1.size();i++){
//            if(list1.get(i)>largest){
//                largest=list1.get(i);
//            }
            largest=Math.max(largest,list1.get(i));
        }
        System.out.println(largest);

        //swap 2 no.
        System.out.println(list1);
        swap(list1,2,3);
        System.out.println(list1);

        //sorting an arraylist
        Collections.sort(list1);   //-->sort in ascending order
        //collections-->class  //collection-->interface
        System.out.println(list1);
        Collections.sort(list1,Collections.reverseOrder());  //sort in descending order
        System.out.println(list1);


        //multi dimensional arraylist
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();

        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        mainlist.add(list);

        ArrayList<Integer>rub=new ArrayList<>();
        rub.add(65);
        rub.add(54);
        rub.add(75);
        mainlist.add(rub);

        for (int i=0;i<mainlist.size();i++){
            ArrayList<Integer>currentlist=mainlist.get(i);
            for (int j=0;j<currentlist.size();j++){
                System.out.print(currentlist.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);

        //maxStorerdwater
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        containerWithMostWater(height);

        //another approach
        storedWater(height);

        //pairsum1
        pairsum1(height,7);

        ArrayList<Integer>list4=new ArrayList<>();
        list4.add(3);
        list4.add(4);
        list4.add(5);
        list4.add(6);
        list4.add(7);
        list4.add(8);
        list4.add(9);

        ArrayList<Integer>list5=new ArrayList<>();
        list4.add(11);
        list4.add(15);
        list4.add(6);
        list4.add(8);
        list4.add(9);
        list4.add(10);

        //another pairsum1 approach
        System.out.println(pairSum(list4,9));

        //pairsum2
        System.out.println(pairSum2(list5,16));
    }
}
