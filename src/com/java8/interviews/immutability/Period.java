package com.java8.interviews.immutability;

import java.util.Date;

/**
 * Created by Pavithra Sachidananda on 1/7/18.
 * The class teaches about Defensive Copying - what is it and why its needed.
 *
 * Defensive copying means storing or returning a copy of a value instead of the actual value.
 *
 * Why do we need this ? One must always program defensively, with the assumption that a client will always try
 * to destroy the invariants. This is especially true to Immutable classes. If an immutable class has refrences
 * to mutable class, the client can still modify the immutable class state. Below is the example of one
 * such class :
 *
 *
 */
public final class Period {

    private final Date start;
    private final Date end;

    /**
     * At first glance, ths class looks like a perfectly immutable class
     * But this class's mutability can be broken. Refer to the psvm method.
     * @param start
     * @param end
     */
    public Period(Date start, Date end) {

        //can break the state of Period
//        if(start.after(end)) {
//            throw new IllegalArgumentException();
//        }
//        this.start = start;
//        this.end = end;

        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if(this.start.after(this.end)) {
            throw new IllegalArgumentException();
        }

        /**
         * Another solution to this is : store start and end as long.
         * Since long is primitive and not mutable, the state can be maintained
         * without alteration
         */

    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }

    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start, end);
        end.setYear(2009); //ERROR! Breaks the immutability of Period
        /**
         * This is because we are modifying the endDate and since Date is mutable
         * the state of Period is modified.
         * This can be avoided by creating defensive copies of startDate and endDate
         * in the constructor before setting the state of Period
         *
         */
    }
}
