import java.io.*;
import java.util.ArrayList;

public class EmployeeDatabase {
    private static final String FILE_NAME = "employees.csv";

    public static void saveEmployees(ArrayList<Employee> employees) {
        try (PrintWriter out = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Employee e : employees) out.println(e.toCSV());
        } catch (IOException ex) {
            System.out.println("Error saving employees: " + ex.getMessage());
        }
    }
    public static ArrayList<Employee> loadEmployees() {
        ArrayList<Employee> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) list.add(Employee.fromCSV(line));
        } catch (FileNotFoundException ignore) {
        } catch (IOException ex) {
            System.out.println("Error loading employees: " + ex.getMessage());
        }
        return list;
    }
}