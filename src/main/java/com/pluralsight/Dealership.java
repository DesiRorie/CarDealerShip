package com.pluralsight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Dealership {
    String name;
    String address;
    String phone;

    ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        ArrayList inventory = new ArrayList<>();
    }

    List<Vehicle> getVehiclesByPrice(double min, double max){
        //create an array of the vehicles that fit into the range.
        return null ;
    }
    List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }
    List<Vehicle> getVehicleYear(int min, int max){
        return null;
    }
    List<Vehicle> getVehiclesByColor(String color){
        return null;
    }
    List<Vehicle> getVehiclesByMileage(int min, int max){
        return null;
    }
    List<Vehicle> getVehiclesType(String vehicleType){
        return null;
    }

    List<Vehicle> getAllVehicles(){
        return inventory;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);

    }
    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }
}
