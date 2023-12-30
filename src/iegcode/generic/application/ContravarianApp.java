package iegcode.generic.application;

import iegcode.generic.MyData;

public class ContravarianApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Ibrahim");
        objectMyData.setData(100);

        MyData<? super String> myData = objectMyData;
        process(objectMyData);
        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData){
        Object value = (Object) myData.getData(); // getData tidak aman, kebalikan sama convariant
        System.out.println("Prosess parameter " + value);

        myData.setData("Ibrahim El Gibran");
    }
}
