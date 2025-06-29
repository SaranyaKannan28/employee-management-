import java.util.ArrayList;

public class ReportGenerator {
    public static void generateReport(ArrayList<Employee> employees) {
        System.out.println("\nEmployee Salary Report");
        System.out.println("-------------------------------------------");
        for (Employee e : employees) {
            System.out.println("Name: " + e.getName());
            System.out.println("Position: " + e.getPosition());
            System.out.println("Base Salary: " + e.getBaseSalary());
            System.out.println("Days Worked: " + e.getWorkingDays());
            System.out.println("Calculated Salary: " + e.calculateSalary());
            System.out.println("-------------------------------------------");
        }
    }
}