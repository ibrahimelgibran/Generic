package iegcode.generic.application;

import iegcode.generic.util.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {

        String[] names = {"Ibrahim", "El", "Gibran"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(numbers));
    }
}
