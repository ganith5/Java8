package com.java8.methodref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by pavithraabhishek on 4/25/17.
 */
public class InstanceMethodReferenceTest {

    public static void main(String[] args) {

        List<Jedi> jedis = Arrays.asList(new Jedi("J1", 2), new Jedi("J2", 3), new Jedi("J3", 4));

        List<String> names = map(Jedi :: getName , jedis);

        System.out.println(names);


    }

    static <T,R> List<R> map(Function<T,R> function, List<T> source) {

        List<R> destiny = new ArrayList<R>();

        for(T item : source) {
            R value = function.apply(item);
            destiny.add(value);
        }

        return destiny;

    }
}
