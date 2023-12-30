package iegcode.generic.application;

import iegcode.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Gibran");
        proccess(stringMyData);

       MyData<? extends Object> myData = stringMyData;
    }

    public static void proccess (MyData<? extends Object> myData){
        System.out.println(myData.getData());

        // myData.setData(1); tidak boleh, karna berbahaya
    }
}
