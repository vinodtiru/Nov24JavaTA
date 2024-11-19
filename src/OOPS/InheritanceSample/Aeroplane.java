package OOPS.InheritanceSample;

public class Aeroplane extends Vehicle implements Flyable{
    @Override
    String start(int engineSize) {
        return "The Aeroplane is ready to fly";
    }

    @Override
    public void Fly() {
        System.out.println("Aeroplane is flying");
    }
}
