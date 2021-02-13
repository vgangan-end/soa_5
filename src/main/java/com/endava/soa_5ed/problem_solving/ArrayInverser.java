package com.endava.soa_5ed.problem_solving;

public class ArrayInverser {
    //Given an array of floating point numbers, inverse the elements of the array
    public static float[] inverseArray(float[] array){
        float[] resultArray = new float[array.length];
        for(int i=0; i<array.length; i++){
            resultArray[array.length-i-1] = array[i];
        }
        return resultArray;
    }
}
