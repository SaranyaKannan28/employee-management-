public class Employee extends User {
    private String name;
    private String position;
    private double baseSalary;
    private int workingDays;
    private static final int TOTAL_WORKING_DAYS = 30;

    public Employee(String username, String password, String name, String position, double baseSalary) {
        super(username, password);
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
        this.workingDays = 0;
    }

    public String getName() { return name; }
    public String getPosition() { return position; }
    public double getBaseSalary() { return baseSalary; }
    public int getWorkingDays() { return workingDays; }

    public void setPosition(String position) { this.position = position; }
    public void setBaseSalary(double salary) { this.baseSalary = salary; }
    public void markAttendance() { workingDays++; }
    public double calculateSalary() {
        return (workingDays / (double) TOTAL_WORKING_DAYS) * baseSalary;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Days Worked: " + workingDays);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
    public String toCSV() {
        return username + "," + password + "," + name + "," + position + "," + baseSalary + "," + workingDays;
    }
    public static Employee fromCSV(String data) {
        String[] p = data.split(",");
        Employee e = new Employee(p[0], p[1], p[2], p[3], Double.parseDouble(p[4]));
        e.workingDays = Integer.parseInt(p[5]);
        return e;
    }
}