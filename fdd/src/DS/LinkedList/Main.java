package DS.LinkedList;

import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addLast(0);
        list.addLast(-10);
        list.addFirst(50);

        list.removeFirst();
        //list.removeLast();
        list.removeLast();
        //list.removeLast();
  

        System.out.println(list.contains(0));
        System.out.println(list.size());


        System.out.println( Arrays.toString(list.toArray()));

        System.out.println(list.size2());
        


    }


}