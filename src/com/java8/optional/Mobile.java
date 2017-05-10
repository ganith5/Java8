package com.java8.optional;

/**
 * Created by pavithraabhishek on 5/3/17.
 * Without optional
 */
//public class Mobile {
//
//    private long id;
//    private String brand;
//    private String name;
//    private DisplayFeatures displayFeatures;
//    // Likewise we can see Memory Features, Camera Features etc.
//
//    public Mobile(long id, String brand, String name,
//                  DisplayFeatures displayFeatures){
//        this.id = id;
//        this.brand = brand;
//        this.name = name;
//        this.displayFeatures = displayFeatures;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public DisplayFeatures getDisplayFeatures() {
//        return displayFeatures;
//    }
//}

import java.util.Optional;

/**
 * With Optional
 *
 */

public class Mobile {

    private long id;
    private String brand;
    private String name;
    private Optional<DisplayFeatures> displayFeatures;
    // Like wise we can see MemoryFeatures, CameraFeatures etc.
    // For simplicity, using only one Features

    public Mobile(long id, String brand, String name, Optional<DisplayFeatures> displayFeatures){
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.displayFeatures = displayFeatures;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public Optional<DisplayFeatures> getDisplayFeatures() {
        return displayFeatures;
    }

}
