package org.pg4200.les02.queue;

public class MyRingArrayQueue<T> implements MyQueue {

    //init of data
    protected Object[] data;
    private int head = -1;
    private int tail = -1;

    //standardized init with capacity of 10
    MyRingArrayQueue(){this(10);}
    MyRingArrayQueue(int cap){data = new Object[cap];}

    @Override
    public void enqueue(Object value) {
        if(isEmpty()){head= 0; tail = 0;}
        else if(tail < data.length-1){tail++;}
        else{
            //check if space in front of head by adding one to the tail and doing modulo, such as (2 > (9+1) %10) True
            if(head > (tail+1) % size()){
                tail = (tail+1) % size();
            } else{
                //copy array into double size array!
                Object[] bigData = new Object[size()*2];
                for(int i = head; i < tail+1; i++){bigData[i] = data[i];}
                data = bigData;
                tail++;
            }
        }
        data[tail] = value;
    }

    @Override
    public T dequeue() {
        int size = size();
        if(isEmpty()){
            throw new RuntimeException();
        }

        T value = (T) data[head];

        if(size == 1){
            //now it ll be empty
            head = -1;
            tail = -1;
        } else {
            head = (head+1)%data.length;
        }

        return value;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new RuntimeException();
        }

        return (T) data[head];
    }

    @Override
    public int size() {
        if(head < 0){return 0;}
        if(tail < head){return data.length-(head-tail);}
        if(tail == head && head > 0){return data.length;}
        else{return (tail-head)+1;}
    }
}
