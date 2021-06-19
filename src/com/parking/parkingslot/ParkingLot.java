package com.parking.parkingslot;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

//Creates a Parking Lot with Number of levels and the spots in each level given.
public class ParkingLot{
    private Level[] levels;
    // set default level = 1
    private int numberLevel = 2;
    private int numberSpots;

    Map<String, ArrayList<String>> ProvincetoVehicle;
    public ParkingLot( int numberSpots, int numberLevel){
        this.numberSpots = numberSpots;
        this.numberLevel = numberLevel;
        this.ProvincetoVehicle = new HashMap<String, ArrayList<String>>();
        levels = new Level[numberLevel];
        for (int i = 0; i < numberLevel; i++){
            levels[i] = new Level(i, numberSpots);
            System.out.println("Level " + i + " created with " + numberSpots + " " +  "spots");
        }

    }

    public boolean parkVehicle(Vehicle vehicle){
        System.out.println(" ------------------------------------ ");
        if(!isDuplicate(vehicle)) {
            for (int i = 0; i < levels.length; i++) {
                if (levels[i].parkVehicle(vehicle)) {
                    vehicle.level = i;
                    System.out.println(" Level " + i + " with Vehicle Number " + vehicle.licensePlate + " from " + vehicle.province);
                    if (this.ProvincetoVehicle.containsKey(vehicle.province)) {
                        ArrayList<String> regNoList = this.ProvincetoVehicle.get(vehicle.province);
                        this.ProvincetoVehicle.remove(vehicle.province);
                        regNoList.add(vehicle.licensePlate);
                        this.ProvincetoVehicle.put(vehicle.province, regNoList);
                    } else {
                        ArrayList<String> regNoList = new ArrayList<String>();
                        regNoList.add(vehicle.licensePlate);
                        this.ProvincetoVehicle.put(vehicle.province, regNoList);
                    }
                    return true;
                }
            }
            System.out.println("PARKING FULL");
            return false;
        }
        return false;
    }

    public boolean isDuplicate(Vehicle vehicle){
        ArrayList<String> vehicleList = this.ProvincetoVehicle.get(vehicle.province);
        if (null != vehicleList && vehicleList.contains(vehicle.licensePlate)) {
            System.out.println("Vehicle Number " + vehicle.licensePlate + " from " + vehicle.province + " stoped in parking");
            return true;
        }
        return false;
    }

    public boolean leave(Vehicle vehicle){
        System.out.println(" ------------------------------------------ ");
        ArrayList<String> vehicleList = this.ProvincetoVehicle.get(vehicle.province);
        if (null != vehicleList && vehicleList.contains(vehicle.licensePlate)) {
            System.out.println("Spot freed from  Level " + vehicle.level + " and exited  " + vehicle.licensePlate + " of " + vehicle.province);
            levels[vehicle.level].spotFreed();
            vehicleList.remove(vehicle.licensePlate);
        }
        return true;
    }

}
