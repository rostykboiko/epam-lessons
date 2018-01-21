package com.epam.generics;

//Write a generic method to count the number of elements in a collection that have a specific property
// (for example, odd integers, prime numbers, palindromes).
public class Generics<T> {
    private T type;

    T set(T type){
        return this.type = type;
    }

    T get(){
        return type;
    }

}
