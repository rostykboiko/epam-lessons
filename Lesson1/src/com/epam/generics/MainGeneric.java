package com.epam.generics;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainGeneric {

    public void run(){
        List<Generics> testList = new ArrayList<>();
        Generics<String> stringGenerics = new Generics<>();
        stringGenerics.set("Okko");

        Generics<Integer> integerGenerics = new Generics<>();
        integerGenerics.set(7);
        integerGenerics.set(8);

        testList.add(stringGenerics);
        testList.add(integerGenerics);
    }

    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {

        return 0;
    }
}
