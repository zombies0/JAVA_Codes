package DS.LinkedList;


public class LinkedList {

    private class Node{

        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }

    }

    private Node first;
    private Node last;
    private int size;

    //O(1)
    public void addLast(int val){

        var node = new Node(val);

        if(isEmpty())

           first = last = node;

        else{

            last.next = node;
            last = node;

        }
        size++;

    }
    //O(1)
    public void addFirst(int val){

        var node = new Node(val);

        if (isEmpty())
            last = first = node;
        else{

            node.next = first;
            first = node;

        }
        size++;


    }

    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int items){

        int index = 0;
        var current = first;

        while(current != null){

            if(current.value == items) return index;;

            current = current.next;
            index++;
        }
        return  -1;

    }

    public boolean contains(int items){

       /* var current = first;

        while(current != null){

            if (current.value == items) return true;
            current = current.next;

        }
        return false;
    */
        return indexOf(items) != -1;
    }

    //O(1)
    public void removeFirst(){

        if (isEmpty()) throw new IllegalStateException("Linked list is empty");
        else if (first == last) first = last = null;
        else {

            var sec = first.next;
            first.next = null;
            first = sec;

        } 
        size--;

    }

    //O(n)
    public void removeLast() {

        if (isEmpty()) throw new IllegalStateException("Linked List is empty");
        else if(first == last) first = last = null;
        else {

            var prev = getPrevious(last);
            last = prev;
            last.next = null;
            

        }

        size--;

    }

    private Node getPrevious(Node prev){

        prev = first;

        while(prev.next != last){
            prev = prev.next;
        }

        return prev;
    }

    public int size(){

        //Unefficient way O(n)

        /* if (isEmpty()) 
            return -1;

        int count = 1;;

        var cou = first;

        while(cou != last){
            cou = cou.next;
            count++;
        } 
        
        return count;
        */

        //efficient way O(1)

        return size;

    }

    public int[] toArray(){

        if (isEmpty()) throw new IllegalArgumentException("list is empty");

        int[] array = new int[size];

        int i = 0;

        var cou = first;

        while(cou != last){

            array[i++] = cou.value;

            cou = cou.next;

        }

        return array;

    }

    // 1 2 3 4 5 6



}