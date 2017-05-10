package com.java8.optional;

import java.util.Optional;

/**
 * Created by pavithraabhishek on 5/3/17.
 */
//public class MobileService {
//
//    public int getMobileScreenWidth(Mobile mobile){
//
//        if(mobile != null){ // Null check mandatory
//            DisplayFeatures dfeatures = mobile.getDisplayFeatures();
//            if(dfeatures != null){
//                ScreenResolution resolution = dfeatures.getResolution();
//                if(resolution != null){
//                    return resolution.getWidth();
//                }
//            }
//        }
//        return 0;
//
//    }
//}

public class MobileService {

    public Integer getMobileScreenWidth(Optional<Mobile> mobile){
        return mobile.flatMap(Mobile::getDisplayFeatures)
                .flatMap(DisplayFeatures::getResolution)
                .map(ScreenResolution::getWidth)
                .orElse(0);

    }

}
