package OOPS.CollectionSample;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortingSample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student seema = new Student();
        seema.setAge(20);
        seema.setName("Seema");

        Student ban = new Student();
        ban.setName("Ban");
        ban.setAge(22);

        Student abhi = new Student();
        abhi.setAge(25);
        abhi.setName("Abhi");

        students.add(seema);
        students.add(ban);
        students.add(abhi);

        Collections.sort(students);

        for (Student s: students){
            System.out.println("Name : " + s.getName() + " Age : " + s.getAge());
        }

    }
}
