package com.java8.interviews.memleak;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pavithra Sachidananda on 12/17/17.
 */
public class MemLeakTest {

    public final String key;

    public MemLeakTest(String key) {
        this.key =key;
    }

    public static void main(String[] args) {
        try {
            Map map = new HashMap();

            for(int i=0;i<2;i++) {
                map.put(new MemLeakTest("key"), "value");
            }

            System.out.print(map);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return (int)Math.random();
    }
}
