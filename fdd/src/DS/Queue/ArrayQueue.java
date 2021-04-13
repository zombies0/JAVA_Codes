package DS.Queue;

import java.util.Arrays;

public class ArrayQueue {

    private int front = 0;
    private int rear = 0;
    int[] ar;

    public ArrayQueue(int size) {  ar = new int[size]; }

    public void enqueue(int value){

        if (isFull()) {

            int[] arr = new int[ar.length *2];
            for (int i = 0; i < ar.length; i++){
                arr[i] = ar[i];
            }
            ar = arr;
        }
        
        ar[rear++] = value;
    }
    public int deQueue(){

        if (isEmpty()) throw new IllegalStateException("Queue is empty");

        int re = ar[front];
        ar[front++] = 0;
        return re;

    }

    public boolean isEmpty(){ return front == rear; }
    public boolean isFull(){ return ar.length == rear; }
    public int peek(){ return ar[rear-1]; }
    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOfRange(ar,front,rear));
    }   

}