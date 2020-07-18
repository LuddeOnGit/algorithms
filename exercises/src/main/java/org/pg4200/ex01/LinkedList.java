package org.pg4200.ex01;

import org.pg4200.ex01.MyListInteger;

public class LinkedList implements MyListInteger{

    private class node{
        int value;
        node next;
    }

    private node head;
    private node tail;
    private int size;

    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Integer get(int index) {
        if(head==null) return null;

        node current = head;
        int count = 0;

        while(current != null){
            if (count == index) return current.value;
            current = current.next;
            count++;
        }
        return null;
        }

    @Override
    public void add(int input) {
        node newNode = new node();
        newNode.value = input;
        size++;

        if(head==null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    @Override
    public int size() {
        return size;
    }


}
