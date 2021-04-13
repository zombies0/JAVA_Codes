package DS.Stack;

public class Main {

    public static void main(String[] args) {
        
        Stack stack = new Stack();

        stack.push(2);

        stack.push(4);

        stack.push(3);

        stack.push(7);

        stack.push(7);
        stack.push(7);
        stack.pop();
        System.out.println(stack.pop());


        System.out.println("peek = " + stack.peek());
        System.out.println("peek = " + stack.top());

        System.out.println(stack);

    }
    
}
