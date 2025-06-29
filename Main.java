import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Owner owner = new Owner("admin", "admin123");
        owner.getEmployees().addAll(EmployeeDatabase.loadEmployees());

        while (true) {
            System.out.println("\nEmployment Management System");
            System.out.println("1. Owner Login");
            System.out.println("2. Employee Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1 -> ownerLogin(scanner, owner);
                case 2 -> employeeLogin(scanner, owner);
                case 3 -> { System.out.println("Goodbye!"); scanner.close(); return; }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
    // Helper functions omitted for brevity...
}