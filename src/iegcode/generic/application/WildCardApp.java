package iegcode.generic.application;

import iegcode.generic.MyData;

public class WildCardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(100));
        print(new MyData<String>("Gibran"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void print (MyData<?> myData){
        System.out.println(myData.getData());
    }
}
