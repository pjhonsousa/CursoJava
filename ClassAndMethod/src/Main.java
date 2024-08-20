import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("age: ");
        int age = sc.nextInt();
        System.out.println("Salary: ");
        double salary = sc.nextDouble();

        Employee employee = new Employee(name, age, salary);

        employee.increaseSalary(2000);

        System.out.println(employee);

    }
}