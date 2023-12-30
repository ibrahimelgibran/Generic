package iegcode.generic.application;

import iegcode.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Gibran");
       // doIt(stringMyData); err
        // MyData<Object> objectMyData = stringMyData; err

        MyData<Object> objectMyData = new MyData<>(100);
        // MyData<Integer> integerMyData = objectMyData; err
        // doItInteger(objectMyData); err
    }

    public static void doIt(MyData<Object> objectMyData ){
        // do nothing
    }
    public static void doItInteger(MyData<Integer> IntegerMydata ){
        // do nothing
    }

}
