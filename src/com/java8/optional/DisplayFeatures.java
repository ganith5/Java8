package com.java8.optional;

/**
 * Created by pavithraabhishek on 5/3/17.
 */
//public class DisplayFeatures {
//    private String size; // In inches
//    private ScreenResolution resolution;
//
//    public DisplayFeatures(String size, ScreenResolution resolution){
//        this.size = size;
//        this.resolution = resolution;
//    }
//
//    public String getSize() {
//        return size;
//    }
//    public ScreenResolution getResolution() {
//        return resolution;
//    }
//}

import java.util.Optional;

/**
 * With Optional
 */

public class DisplayFeatures {

    private String size; // In inches
    private Optional<ScreenResolution> resolution;

    public DisplayFeatures(String size, Optional<ScreenResolution> resolution){
        this.size = size;
        this.resolution = resolution;
    }

    public String getSize() {
        return size;
    }
    public Optional<ScreenResolution> getResolution() {
        return resolution;
    }

}
