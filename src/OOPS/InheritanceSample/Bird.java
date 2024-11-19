package OOPS.InheritanceSample;

public class Bird extends Animal implements Flyable{
    @Override
    public void Fly() {
        System.out.println("The bird is now flying ");
    }
}
