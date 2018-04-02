package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by pavithraabhishek on 5/2/17.
 */
public class FlatmapTest {

    public static void main(String[] args) {
        List<Foo> foos = new ArrayList<>();

        IntStream.range(1, 4).forEach(i -> foos.add(new Foo("foo" + i)));

        foos.forEach(foo -> IntStream.range(1, 4).forEach(j -> foo.bars.add(new Bar("bar" + j + " <- " + foo.name))));

        //System.out.println("Foos : " + foos);

        foos.stream().flatMap(foo -> foo.bars.stream()).forEach(bar -> System.out.println(bar.name));

        //All statements can be combined into one statement as below

        System.out.println("=======================================================================================");

        IntStream.range(1, 4).mapToObj(i -> new Foo("foo" + i))
                .peek(f -> IntStream.range(1, 4)
                        .mapToObj(j -> new Bar("bar" + j + " <- " + f.name))
                        .forEach(f.bars::add))
        .flatMap(f -> f.bars.stream())
        .forEach(b -> System.out.println(b.name));

    }
}


class Foo {
    String name;
    List<Bar> bars = new ArrayList<Bar>();

    Foo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "name='" + name + '\'' +
                ", bars=" + bars +
                '}';
    }
}

class Bar {
    String name;

    Bar(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "name='" + name + '\'' +
                '}';
    }
}
