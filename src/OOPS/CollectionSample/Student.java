package OOPS.CollectionSample;

public class Student implements Comparable<Student>{
    private Integer age;
    private String name;
    private Integer rollNumber;
    private String standard;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }


    @Override
    public int compareTo(Student s) {
        if(this.age != s.age) {
            return Integer.compare(this.age, s.age);
        } else {
            return this.getName().compareTo(s.getName());
        }
    }
}
