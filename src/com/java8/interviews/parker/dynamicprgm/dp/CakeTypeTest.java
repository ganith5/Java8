package com.java8.interviews.parker.dynamicprgm.dp;



/**
 * This is an example of dynamic programming.
 * Space complexity - O(k), where k is the capacity of duffel bag
 * Time complexity - O(n * k), where n is the number of cake types, k is the duffel bag capacity.
 * Two loops are running, therefore, complexity = O(n*k)
 */
public class CakeTypeTest {

    static CakeType[] cakeTypes = new CakeType[]{
            new CakeType(7, 160),
            new CakeType(3, 90),
            new CakeType(2, 15),
            new CakeType(0, 15)

    };

    static int capacity = 20;

    public static void main(String[] args) {

        System.out.println("Max Value = " + maxDuffelBagValue(cakeTypes, capacity));

    }

    public static long maxDuffelBagValue(CakeType[] cakeTypes, int weightCapacity) {

        //array to hold maxValue of each capacity
        int[] maxValueAtCapacity = new int[weightCapacity + 1];


        for(int capacity = 0; capacity<=weightCapacity; capacity++) {
            int currentMaxValue = 0;
            int currentCapacity = capacity;

            for(CakeType cakeType:cakeTypes){

                if(cakeType.weight == 0 && cakeType.value != 0) {
                    throw new InfinityException();
                }

                if(cakeType.weight <= currentCapacity) {
                    //do something
                    int remainingWeightAtThisCake = currentCapacity - cakeType.weight;
                    int maxValueAtThisCake = cakeType.value + maxValueAtCapacity[remainingWeightAtThisCake];

                    currentMaxValue = Math.max(maxValueAtThisCake, currentMaxValue);


                }
            }

            maxValueAtCapacity[capacity] = currentMaxValue;
        }
        return maxValueAtCapacity[weightCapacity];
    }


    static class CakeType implements Comparable{
         int weight;
         int value;
         double valuePerWeight;

        CakeType(int weight, int value) {
            this.weight = weight;
            this.value = value;
            this.valuePerWeight = ((double)value/weight);
        }

        @Override
        public String toString() {
            return "" + weight + "  " + value + "  " + valuePerWeight;
        }

        @Override
        public int compareTo(Object o) {
            CakeType cakeType = (CakeType)o;
            if(cakeType.valuePerWeight > this.valuePerWeight)
                return 1;
            else if(cakeType.valuePerWeight < this.valuePerWeight)
                return -1;
            else return 0;
        }
    }

    static class InfinityException extends RuntimeException {
        public InfinityException() {
            super("Max value is infinity!");
        }
    }
}
