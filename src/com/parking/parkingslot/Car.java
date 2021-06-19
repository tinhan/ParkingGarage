package com.parking.parkingslot;


public class Car extends Vehicle {
    public Car(String licensePlate, String province){
        spotsNeeded = 1;
        size = VehicleSize.CarSize;
        this.licensePlate = licensePlate;
        this.province = province;
    }

    public boolean canFitInSpot(ParkingSpot spot){
        //checks if the spot is for a car
        return spot.getSize() == VehicleSize.CarSize;
    }
}
