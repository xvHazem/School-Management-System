package schoolmanagement;

public class SupportStaff extends Employee {
    private String role; // مثلاً سائق باص، موظف دعم، الخ

    public SupportStaff(int employeeId, String employeeName, double salary, int departmentId, String role) {
        super(employeeId, employeeName, salary, departmentId);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void employeeDetails() {
        super.employeeDetails();
        System.out.println("Role: " + role);
    }
}
