package iegcode.generic.application;

import iegcode.generic.MyData;

public  class GenericClassApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Gibran");
        MyData<Integer> integerMyData = new MyData<Integer>(17);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}

