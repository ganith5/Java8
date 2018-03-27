package com.java8.interviews.immutability;

import java.util.TimerTask;

/**
 * Created by Pavithra Sachidananda on 1/7/18.
 *
 * Immutablity : The state of the object cannot be modified. The state is created when the object is created.
 * Immuatable objects are very simple, they maintain the state they acquire when the object is created.
 * Immutable objects are thread-safe. Since the state cannot be modified, the object can be easily shared between threads.
 * Since the state cannot be modified, some of the common objects can be stored as constants.
 * Eg: public static final ComplexNumber ZERO = new ComplexNumber(0,0)
 *
 * Immutable objects make great Map keys and Set elements. You don't have to worry about values
 * changing once they are added to the data structure.
 *
 * DISADVANTAGE :
 *
 * Immutable classes require a separate object for each value. If a BigInteger with a large value has to be modified
 * then we have to create a new object with the same value and modify that object.
 * This creation of object is very costly and can cause performance and space issues.
 *
 *
 *
 *
 * Five steps to make a object immutable :
 *
 * 1) Make the class final
 *      - Prevents clients from subclassing this class and modifying state
 *    Final classes cannot be subclassed. This can be avoided by removing final and creating a
 *    private constructor. A static factory class can return an instance everytime the object is created.
 * 2) Don't provide any methods to modify the object state.
 *
 * 3) Make all fields final - The value cannot be modified
 * 4) Make all fields private
 *      - Prevents clients from modifying the fields directly
 * 5) Ensure exclusive access to any mutable components
 *      -
 */
public final class ComplexNumber {
    //public class ComplexNumber {

    private TimerTask timerTask;

    private double re;
    private double im;

    public ComplexNumber(double re, double im) {
        //private ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    /**
     * Static factory method used to create an instance
     * @return
     */
//    public static ComplexNumber valueOf(double re, double im) {
//        return new ComplexNumber(re, im);
//    }

    public double realPart(){
        return re;
    }

    public double imgPart() {
        return im;
    }

    /**
     * Method returns defensive copies of final object
     * to maintain immutability.
     * @param cn
     * @return
     */
    public ComplexNumber add(ComplexNumber cn) {
        return new ComplexNumber(re + cn.re, im + cn.im);
    }

    public ComplexNumber subtract(ComplexNumber cn) {
        return new ComplexNumber(re - cn.re, im - cn.im);
    }

    public ComplexNumber multiply(ComplexNumber cn) {
        return new ComplexNumber(re * cn.re, im * cn.im);
    }

    public ComplexNumber divide(ComplexNumber cn) {
        return new ComplexNumber(re - cn.re, im - cn.im);
    }
}
