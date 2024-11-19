package OOPS.InheritanceSample;

// Car is a Vehicle
public class Car extends Vehicle{
    @Override
    String start(int engineSize) {
        return "This car engine is now running hot";
    }
}
