# ParkingGarage

### How to set up on your local

#### Pre-require

 1). Install JDK : https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
 
 2). Install IntelliJ IDEA : https://www.jetbrains.com/idea/download/#section=mac 
 
 **Note You can use any of IDE can implement java program.

#### Set up and run local
 1). Clone repo from https://github.com/tinhan/ParkingGarage.git
 
 2). Open project in IDE.
 
 3). Run Main.java for start project.
 

#### Result of ParkingGarage program.
    
    Level 0 created with 2 spots
    Level 1 created with 2 spots
    Level 2 created with 2 spots
    Level 3 created with 2 spots
    Level 4 created with 2 spots
     ------------------------------------ 
    This is a Car parked in Lane Number  0,Spot Number 0 Level 0 with Vehicle Number 1234 from Bangkok
    ------------------------------------ 
    This is a Car parked in Lane Number  0,Spot Number 1 Level 0 with Vehicle Number 1680 from khonkaen
    ------------------------------------ 
    This is a Car parked in Lane Number  0,Spot Number 0 Level 1 with Vehicle Number 5567 from Bangkok
    ------------------------------------ 
    Vehicle Number 1234 from Bangkok stoped in parking
    ------------------------------------------ 
    Spot freed from  Level 1 and exited  5567 of Bangkok
    Available Spots in the current level :2
     ------------------------------------ 
    This is a Motorcycle parked in Lane Number  0,Spot Number 1 Level 1 with Vehicle Number 4556 from Bangkok
    ------------------------------------ 
    This is a Motorcycle parked in Lane Number  0,Spot Number 0 Level 2 with Vehicle Number 0789 from khonkaen
    ------------------------------------ 
    Vehicle Number 0789 from khonkaen stoped in parking
    
    

#### Set up parameter
1). Set up lever ans spots.

      
       /* Set up parking 3 = number of spots, 5 number of levels (default =2)
       level 0 = G floor. */
       ParkingLot P1 = new ParkingLot(2, 5);
       
      

2). Set up car.

    
    // set car
    Car c1 = new Car("1234", "Bangkok");
    

3). Set up Motorcycle.

    
    // set Motorcycle 
    Motorcycle m1 = new Motorcycle("4556", "Bangkok");
    

4). Park Vehicle.

    
     ParkingLot P1 = new ParkingLot(2, 5);
     Car c1 = new Car("1234", "Bangkok");
     Motorcycle m1 = new Motorcycle("4556", "Bangkok");
       
     P1.parkVehicle(c1);
     P1.parkVehicle(m1);
     
    
 
