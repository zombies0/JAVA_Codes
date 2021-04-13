//Ques1 :- Reverse Queue using Stack

package DS.Queue;

public class Ques1 {

    public static void main(String[] args) {

        java.util.Queue<Integer> qeueue = new java.util.ArrayDeque<Integer>();

        qeueue.add(10);
        qeueue.add(20);
        qeueue.add(30);
        qeueue.add(40);

        System.out.println(qeueue);

        reverse(qeueue);

        System.out.println(qeueue);
        qeueue.remove();
        System.out.println(qeueue);

    }

    public static void reverse(java.util.Queue<Integer> queue){

        if (queue.isEmpty()) throw new IllegalStateException("Queue is empty");

        java.util.Stack<Integer> s = new java.util.Stack<Integer>();

        while (!queue.isEmpty()) s.push(queue.remove()); 
        
        while (!s.isEmpty())  queue.add(s.pop()); 
        

    }
    
}
