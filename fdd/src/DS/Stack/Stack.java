package DS.Stack;

import java.util.Arrays;

public class Stack {

    private int[] ar;
    private int top = 0;
    private int size = 5;

    public Stack(){ ar = new int[size]; }

    public Stack(int size) { ar = new int[size]; }

    public void push(int n){

        if (isFull()) {
            //throw new StackOverflowError(); //to make stack static
            int[] nAr = new int[ar.length * 2];
            
            for (int i = 0; i < ar.length; i++){
                nAr[i] = ar[i];
            }

            ar = nAr;
        }

        ar[top++] = n;

    }

    public int pop(){

        if (isEmpty()) throw new IllegalStateException("Stack Underflow");

        int k = ar[top];
        ar[top--] = 0;

        return k;

    }

    private boolean isFull(){ return ar.length-1 == top; }

    public int peek() {

        if (isEmpty()) throw new IllegalStateException("Empty Stack");

        return ar[top];
    }

    public boolean isEmpty(){

        return ar.length == 0;

    }

    @Override
    public String toString(){
        /* old Method
        int[] re = new int[top];
        for(int i = 0; i < re.length; i++)
            re[i] = ar[i];
        return Arrays.toString(re);
        */

        // New Method to copy array
        return Arrays.toString(Arrays.copyOfRange(ar, 0, top));
    }

    public int top() { return top; }
    
}
