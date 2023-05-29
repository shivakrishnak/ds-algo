package com.algo.leet.matrix;

import static com.algo.util.Helper.printMatrix;

//https://leetcode.com/problems/rotate-image/
public class RotateImage {



    public void main(String[] args) {
        GenericContainer<Integer> myInt = new GenericContainer<Integer>(33);
        System.out.println(myInt.getObject()); // returns 33
    }
}
class GenericContainer<T> {
    T obj;
    GenericContainer(T o){
        obj = o;
    }
    public T getObject(){
        return obj;
    }
}