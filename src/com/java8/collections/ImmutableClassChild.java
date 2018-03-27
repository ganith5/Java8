package com.java8.collections;

import java.util.List;

/**
 * Created by Pavithra Sachidananda on 11/15/17.
 */
public class ImmutableClassChild{

    public ImmutableClassChild(){
        //super(2);
    }


    public static void main(String[] args) {

        ImmutableClass immutableClass = new ImmutableClass(2);
        List list = immutableClass.getList();
        list.add(3);

        System.out.println("1) " + list);

        System.out.println("2)" + immutableClass.getList());


    }
}
