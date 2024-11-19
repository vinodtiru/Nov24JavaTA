package OOPS;

public class Employee {
    private String name;
    private Integer id;
    private Integer salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        if( salary < 5000) {
            this.salary = salary;
        } else
        {
            this.salary = 0;
        }
    }
}
