package org.pg4200.les02.list;

public class MyArrayListResizable<T> extends MyArrayList<T> {

    MyArrayListResizable(){this(10);}
    MyArrayListResizable(int capacity){Object[] data = new Object[capacity];}

    @Override
    public void add(int index, T value) {
        //checking for errors
        if(index < 0){throw new IndexOutOfBoundsException();}

        //if full
        //data = size == data.length ? new Object[size*2] : data;
        if(index == data.length){
            Object[] newData = new Object[size*2];

            for(int i = 0; i < size; i++){
                newData[i] = data[i];
            }
            data = newData;
        }


        super.add(index, value);
    }

    public int length(){return data.length;}
}
