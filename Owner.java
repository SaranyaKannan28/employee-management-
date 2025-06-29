import java.util.ArrayList;

public class Owner extends User {
    private final ArrayList<Employee> employees;

    public Owner(String username, String password) {
        super(username, password);
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Employee added: " + e.getName());
    }
    public void editEmployee(String username, String newPos, double newSal) {
        for (Employee e : employees) {
            if (e.getUsername().equals(username)) {
                e.setPosition(newPos);
                e.setBaseSalary(newSal);
                System.out.println("Updated employee: " + e.getName());
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    public void deleteEmployee(String username) {
        boolean removed = employees.removeIf(e -> e.getUsername().equals(username));
        System.out.println(removed ? "Employee deleted." : "Employee not found.");
    }
    public ArrayList<Employee> getEmployees() { return employees; }
    public void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println();
        }
    }
}