package org.pg4200.les02.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListResizableTest extends MyListTestTemplate{
    protected <T> MyArrayList<T> getNewInstance(Class<T> klass) {
        return new MyArrayListResizable<T>(1);
    }

}
