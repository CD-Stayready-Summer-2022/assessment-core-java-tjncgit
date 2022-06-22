package com.codedifferently.assessment01.part01;

public class IntegerArrayUtils {
    /**
     * Get the sum of all integers in array
     * @param intArray
     * @return
     */
    public static Integer getSum(Integer[] intArray){
        Integer sum = 0;
        for(Integer num: intArray) {
            sum += num;
        }
        return sum;
    }

    /**
     * Get the product of all integers in the array
     * @param intArray
     * @return
     */
    public static Integer getProduct(Integer[] intArray){
        Integer product = 1;
        for(Integer num: intArray) {
            product *= num;
        }
        return product;
        }

    /**
     * Get the average of all integers in the array
     * @param intArray
     * @return
     */
    public static Double getAverage(Integer[] intArray){
        Double sum = 0.0;
        for(Integer num: intArray) {
            sum += num;
        }
        return sum/intArray.length;
        }
}
