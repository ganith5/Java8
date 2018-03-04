package com.java8.concurrency;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Pavithra Sachidananda on 11/5/17.
 */
public class CollectionTest {

    public static void main(String[] args) {
        /**
         * The ConcurrentHashMap is very similar to the java.util.HashTable class, except that ConcurrentHashMap offers
         * better concurrency than HashTable does. ConcurrentHashMap does not lock the Map while you are reading from it.
         * Additionally, ConcurrentHashMap does not lock the entire Map when writing to it. It only locks the part of
         * the Map that is being written to, internally.

         Another difference is that ConcurrentHashMap does not throw ConcurrentModificationException if the
         ConcurrentHashMap is changed while being iterated. The Iterator is not designed to be used by more than one
         thread though.
         */
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putIfAbsent(1, 2);

        System.out.println(concurrentHashMap);
    }
}
