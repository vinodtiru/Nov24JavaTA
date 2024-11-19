package OOPS.InheritanceSample;

abstract class Vehicle {
//    public void start() {
//        System.out.println("Vehicle is started");
//    }

    // This is an abstract method
    abstract String start(int engineSize);

    public void stop() {
        System.out.println("Vehicle is stopped");
    }
}
