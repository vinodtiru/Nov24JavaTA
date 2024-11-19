//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Animal.Fish;
import OOPS.Employee;
import OOPS.InheritanceSample.Aeroplane;
import OOPS.InheritanceSample.Animal;
import OOPS.InheritanceSample.Bird;
import OOPS.InheritanceSample.Dog;

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark();
        d.eat();

        Aeroplane aeroplane = new Aeroplane();
        aeroplane.Fly();

        Bird bird = new Bird();
        bird.Fly();

        Animal a = new Animal();
        a.eat();

        Employee e = new Employee();
        int salary = 20000;

//        if( salary < 5000) {
            e.setSalary(salary);
//        }
        System.out.println(e.getSalary());





//            Animal.Dog d = new Animal.Dog();
//            System.out.println(d.bark());
//
//        Fish f = new Fish();
//        System.out.println(f.swim());


//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}