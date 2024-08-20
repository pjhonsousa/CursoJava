package applicattion;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter department´s name: ");
        String name = sc.next();
        Department department = new Department(name);
        System.out.println("Enter worker data: ");
        String nameWorker = sc.next();
        WorkerLevel level = WorkerLevel.valueOf(sc.next());
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(baseSalary, level, nameWorker);

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #"+ i+1+"data: ");
            sc.nextLine();
            System.out.println("Date (DD/MM/YYYY): )");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            double hours = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int duration = sc.nextInt();

            HourContract contract = new HourContract(contractDate, duration, hours);
            worker.addContract(contract);

        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: "+ worker.getName());
        System.out.println("Department: "+ department.getName());

        System.out.println("Income for: " + worker.income(year, month));

        sc.close();
    }
}
