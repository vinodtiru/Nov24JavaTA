package OOPS.InheritanceSample;


// is a relation Parent => child
// dog is a Animal
// cat is a animal
public class Dog extends Animal{
    public void bark() {
        System.out.println("The dog barks.");
    }

    public void bark(Integer loudness) {
        if(loudness > 5){
            System.out.println("The dog barks very loud.");
        }
        else {
            bark();
        }
    }

//    @Override
//    public void eat() {
//        System.out.println("This dog eats food very fast.");
//    }
}
