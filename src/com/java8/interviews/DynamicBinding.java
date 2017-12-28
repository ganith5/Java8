package com.java8.interviews;

import com.sun.istack.internal.NotNull;

/**
 * Dynamic binding.
 */
public class DynamicBinding {

    static String i = "10";

    public void printThis(){
        System.out.println("From A");
    }

}


class DynamicBindingSub extends DynamicBinding {
    static String i = "20";
    @Override
    public void printThis() {
        //super.printThis();
        System.out.println("From B");
    }

    public static void main(String[] args) {
        DynamicBinding a = new DynamicBindingSub();
        a.printThis();
        System.out.println(i);

        DynamicBinding castA = new DynamicBinding();
        castA.printThis();

        DynamicBindingSub b = (DynamicBindingSub)a;
        b.printThis();




    }
}
