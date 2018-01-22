
package com.java8.interviews.sorting;

/**
 * Time complexity = O(n log n)
 * Space complexity = O(n)
 *
 */
public class MergeSort {

    private static int listToSort[] = new int[] {3, 5, 6, 8, 10, 1, 2, 4, 7, 9};

    public static void main(String[] args) {
        print(listToSort);
        mergeSort(listToSort);
    }

    public static void print(int[] listToSort) {
        for (int el : listToSort) {
            System.out.print(el + ",");
        }
        System.out.println();
    }

    public static void mergeSort(int[] listToSort) {
        if (listToSort.length == 1) { //terminating condition; if the tree length = 1 (i.e. leaves)
            return;
        }

        int midIndex = listToSort.length / 2 + listToSort.length % 2; //get the midpoint of the list to split
        int[] listFirstHalf = new int[midIndex];
        int[] listSecondHalf = new int[listToSort.length - midIndex];
        split(listToSort, listFirstHalf, listSecondHalf);

        mergeSort(listFirstHalf); //recursive calls to merge sort the sub-lists
        mergeSort(listSecondHalf);

        merge(listToSort, listFirstHalf, listSecondHalf); //merge the sorted lists to get the ordered list
        print(listToSort);
    }

    /**
     * Splits the list into two and populates the first half
     * to @param = listFirstHalf and second half to @param listSecondHalf
     * @param listToSort
     * @param listFirstHalf
     * @param listSecondHalf
     */
    public static void split(int[] listToSort, int[] listFirstHalf, int[] listSecondHalf) {
        int index = 0;
        int secondHalfStartIndex = listFirstHalf.length;
        for (int elements : listToSort) {
            if (index < secondHalfStartIndex) {
                listFirstHalf[index] = listToSort[index]; //first half holds all values till midPoint
            } else {
                listSecondHalf[index - secondHalfStartIndex] = listToSort[index];//second half holds the remaining values
            }
            index++;
        }
    }

    public static void merge(int[] listToSort, int[] listFirstHalf, int[] listSecondHalf) {
        //setup indices for the final merged list and the two lists to be merged
        int mergeIndex = 0;
        int firstHalfIndex = 0;
        int secondHalfIndex = 0;

        while (firstHalfIndex < listFirstHalf.length && secondHalfIndex < listSecondHalf.length) {
            /**
             * compare values at currentIndex of both the lists and pick the lesser value and add
             *  to final list [@param listToSort]
             */
            if (listFirstHalf[firstHalfIndex] < listSecondHalf[secondHalfIndex]) {
                listToSort[mergeIndex] = listFirstHalf[firstHalfIndex];
                firstHalfIndex++;
            } else if (secondHalfIndex < listSecondHalf.length) {
                listToSort[mergeIndex] = listSecondHalf[secondHalfIndex];
                secondHalfIndex++;
            }
            mergeIndex++;
        }

        /**
         * the next two if-clauses will add the remaining elements in either of the list and add to the merged list
         */
        if (firstHalfIndex < listFirstHalf.length) {
            while (mergeIndex < listToSort.length) {
                listToSort[mergeIndex++] = listFirstHalf[firstHalfIndex++];
            }
        }
        if (secondHalfIndex < listSecondHalf.length) {
            while (mergeIndex < listToSort.length) {
                listToSort[mergeIndex++] = listSecondHalf[secondHalfIndex++];
            }
        }
    }

}