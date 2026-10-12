import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        double hourlyWage;
        int hoursWorked;
        double grossSalary;
        double tax;
        double netSalary;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        if (name.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            input.close();
            return;
        }

        System.out.print("Enter your hourly wage: ");
        hourlyWage = input.nextDouble();

        System.out.print("Enter your number of hours worked: ");
        hoursWorked = input.nextInt();

        if (hourlyWage < 0 || hoursWorked < 0) {
            System.out.println("Error: hourly wage and/or hours worked cannot be negative.");
            input.close();
            return;
        } else {

            grossSalary = hourlyWage * hoursWorked;
            tax = grossSalary * 0.20;
            netSalary = grossSalary - tax;

            System.out.println();
            System.out.println("Payroll Summary for " + name);
            System.out.println("-----------------------------------");
            System.out.println("Hours Worked: " + hoursWorked);
            System.out.printf("Hourly Wage: $%.2f%n", hourlyWage);
            System.out.printf("Gross Salary: $%.2f%n", grossSalary);
            System.out.printf("Taxes Deducted: $%.2f%n", tax);
            System.out.printf("Net Salary: $%.2f%n", netSalary);
        }

        input.close();
    }
}
