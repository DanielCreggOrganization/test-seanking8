package ie.gmit.lecw3;

// Car

public class Car {
    //instance variables
    int topSpeed;
    int totalSeats;
    int fuelCapacity;
    String manufacturer;
    String colour;
    float engineSize;
    boolean manual;
    float value;

    //Class Methods

    void show(){
        System.out.println(manufacturer);
    }

    void park(){

    }

    void drive(){

    }

    void crash(){
        value = 0;
    }
    
}