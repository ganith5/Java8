package com.java8.functional;

import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * Created by pavithraabhishek on 4/29/17.
 */
public class SupplierTest {
    public static void main(String[] args) {

        driveSomeVehicle(() -> new Vehicle());
        driveSomeVehicle(() -> new Car());
        driveSomeVehicle(Vehicle :: new);
        driveSomeVehicle(Car :: new);

        supplierGetAsInt(() -> Integer.parseInt("45"));

    }

    public static void driveSomeVehicle(Supplier<Vehicle> supplier) {
        Vehicle vehicle = supplier.get();
        vehicle.drive();
    }

    public static void supplierGetAsInt(IntSupplier intSupplier) {
        System.out.println(intSupplier.getAsInt());
    }



}

class Vehicle {
    public void drive() {
        System.out.println("Driving some vehicle");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}
