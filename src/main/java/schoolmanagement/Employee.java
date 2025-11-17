package schoolmanagement;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String departmentId;
    private double salary;

    public Employee(String employeeId, String employeeName, String departmentId, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    public void employeeDetails() {
        System.out.println("Employee: " + employeeName + ", Department: " + departmentId + ", Salary: " + salary);
    }
}
