public class AttendanceManager {
    public static void markAttendance(Employee e) {
        e.markAttendance();
        System.out.println("Attendance marked for: " + e.getName());
    }
}