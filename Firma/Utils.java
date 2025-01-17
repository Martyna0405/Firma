package Firma;

import java.util.List;
import java.util.Scanner;

public class Utils {

    static Company Data() {
        Company company = new Company("Multicristal", "Ulica");

        Person firstPerson = new Person("Weronika", "Nowak");
        Employee firstEmployee = new Employee(firstPerson, Departament.SALES);

        Person secondPerson = new Person("Klaudia", "Michniak");
        Employee secondEmployee = new Employee(secondPerson, Departament.ADMINISTRATION);

        Person thirdPerson = new Person("Aleksandra", "Koral");
        Employee thirdEmployee = new Employee(thirdPerson, Departament.FINANCE);


        List<Employee> employees = company.getEmployees();
        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);


        return company;
    }

    static void text(String message) {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    static String newEmployee(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextLine();
    }
    static int index(String message){
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextInt();
    }
}
