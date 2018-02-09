package com.java8.interviews.parker;

/**
 * Created by Pavithra Sachidananda on 1/3/18.
 *
 * Time complexity = O(n)
 * Space Complexity = O(n)
 */
public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] myArray = new int[]{3,  4,  6, 10, 11, 15};
        int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19, 20,89,200};

        int mergedArrayLen = myArray.length + alicesArray.length;
        int[] mergedArray = new int[mergedArrayLen];
        int iMyArray = 0 ,iAliceArray = 0, iMergeArray = 0;

        while (iMergeArray < mergedArrayLen) {
            boolean isMyArrayEmpty = iMyArray > myArray.length - 1;
            boolean isAliceArrayEmpty = iAliceArray > alicesArray.length - 1;

            if (!isMyArrayEmpty && (isAliceArrayEmpty || myArray[iMyArray] < alicesArray[iAliceArray])) {
                mergedArray[iMergeArray++] = myArray[iMyArray++];
            } else {

                mergedArray[iMergeArray++] = alicesArray[iAliceArray++];
            }
        }

        for (int i:mergedArray
             ) {
            System.out.println(i);
        }
    }
}
