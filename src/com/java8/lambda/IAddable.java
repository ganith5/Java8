package com.java8.lambda;

/**
 * Created by Pavithra Sachidananda on 11/3/17.
 */

@FunctionalInterface
public interface IAddable<T> {

    T add(T a1, T a2);
}
