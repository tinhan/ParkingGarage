package com.parking;

import com.parking.parkingslot.Car;
import com.parking.parkingslot.Motorcycle;
import com.parking.parkingslot.ParkingLot;

public class Main {

    public static void main(String[] args) {

        /* Set up parking 3 = number of spots, 5 number of levels (default =2)
         level 0 = G floor. */
        ParkingLot P1 = new ParkingLot(2, 5);

        // set car
        Car c1 = new Car("1234", "Bangkok");
        Car c2 = new Car("1680", "khonkaen");
        Car c3 = new Car("5567", "Bangkok");
        // car 4 will duplicate with car1
        Car c4 = new Car("1234", "Bangkok");

        // set Motorcycle
        Motorcycle m1 = new Motorcycle("4556", "Bangkok");
        Motorcycle m2 = new Motorcycle("0789", "khonkaen");
        // Motorcycle 3 will duplicate with Motorcycle 2
        Motorcycle m3 = new Motorcycle("0789", "khonkaen");

        // park car
        P1.parkVehicle(c1);
        P1.parkVehicle(c2);
        P1.parkVehicle(c3);
        P1.parkVehicle(c4);

        // Leave car and show available spots.
        P1.leave(c3);

        // park Motorcycle
        P1.parkVehicle(m1);
        P1.parkVehicle(m2);
        P1.parkVehicle(m3);


    }
}
