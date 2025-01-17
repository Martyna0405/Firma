package Firma;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = Utils.Dane();
        System.out.println("Witamy w panelu administracyjnym firmy " + company.getName());

        int L = Company.employees.size();

        boolean done = false;
        while (!done) {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println("----------------");
                System.out.println("Wybierz operacje, którą chcesz wykonać");
                System.out.println("----------------");
                System.out.println("Wybierz 0 aby opuścić program");
                System.out.println("Wybierz 1 jeśli chcesz wyświetlić listę pracowników");
                System.out.println("Wybierz 2 jeśli chcesz dodać pracownika");
                System.out.println("Wybierz 3 jeśli chcesz zwolnić pracownika");

                int option = input.nextInt();

                switch (option) {
                    case 0:
                        Utils.text("Proces został zakończony. Dziękujemy za skorzystanie z panelu naszej firmy. Żegnaj!");
                        done = true;
                        break;
                    case 1:
                        System.out.println(company.getEmployees().toString());
                        break;
                    case 2:
                        System.out.println("----------------");
                        String name = Utils.newemployee("Podaj imię: ");
                        String surname = Utils.newemployee("Podaj nazwisko: ");
                        company.addEmployee(name, surname);
                        Utils.text("Dodano pracownika");
                        break;
                    case 3:
                        System.out.println("Wybierz którego pracownika chcesz zwolnić:");
                        System.out.println("----------------");
                        System.out.println(company.getEmployees().toString());
                        System.out.println("----------------");
                        int numer = Utils.index("Prosimy podać numer indeksu od 0 do "+(L-1)+" :");
                        company.removeEmployee(numer);
                        System.out.println("Zwolniono pracownika.");
                        break;
                    default:
                        System.out.println("Prosimy wybrać numer operacji.");
                }

            } catch (InputMismatchException e) {
                Utils.text("Podano błędną wartość, spróbuj jeszcze raz");
            }
        }
    }
}
