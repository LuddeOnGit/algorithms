package org.pg4200.les02.queue;

public class MyeRingArrayQueueTest extends MyQueueTestTemplate {
    @Override
    protected <T> MyRingArrayQueue getNewInstance(Class<T> klass) {
        return new MyRingArrayQueue<>();
    }
}
