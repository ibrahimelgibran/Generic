package iegcode.generic.application;

import iegcode.generic.Person;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComparableApp {

    public static void main(String[] args) {

        Person[] people= {
                new Person("Ibrahim", "Yogyakarta"),
                new Person("El", "Indonesia"),
                new Person("Gibran", "Sleman"),
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
