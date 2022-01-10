package model;

public class Unternehmen {

    private Integer id;
    private String name;
    //enum  size;
    private Integer nr_employees;
    private Integer salary;
    private String place;

    public Unternehmen(Integer id, String name, Integer nr_employees, Integer salary, String place) {
        this.id = id;
        this.name = name;
        this.nr_employees = nr_employees;
        this.salary = salary;
        this.place = place;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNr_employees() {
        return nr_employees;
    }

    public void setNr_employees(Integer nr_employees) {
        this.nr_employees = nr_employees;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Unternehmen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nr_employees=" + nr_employees +
                ", salary=" + salary +
                ", place='" + place + '\'' +
                '}';
    }
}

