package DS.LinkedList;

import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addLast(1);
        list.addLast(-10);
        list.addFirst(50);

        //list.removeFirst();
        //list.removeLast();
        //list.removeLast();
        //list.removeLast();

        System.out.println( Arrays.toString(list.toArray()));

        list.reverse();


        System.out.println( Arrays.toString(list.toArray()));


    }

}