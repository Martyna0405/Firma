package Firma;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String address;

    public static List<Employee> employees;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(String name, String surname) {
        Person person = new Person(name, surname);
        Employee employee = new Employee(person, Departament.ADMINISTRATION);

        employees.add(employee);
    }

    public void removeEmployee(int numer) {
        employees.remove(numer);
    }

}

