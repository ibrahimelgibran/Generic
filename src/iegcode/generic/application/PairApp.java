package iegcode.generic.application;

import iegcode.generic.Pair;

public class PairApp {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<String, Integer>("El Gibran", 17);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
