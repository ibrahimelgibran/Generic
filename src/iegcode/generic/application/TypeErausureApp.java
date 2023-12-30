package iegcode.generic.application;

import iegcode.generic.MyData;

public class TypeErausureApp {
    public static void main(String[] args) {

        MyData myData = new MyData("Gibran");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        // Integer integer = integerMyData.getData(); err
    }
}
