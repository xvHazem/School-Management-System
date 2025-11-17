package schoolmanagement;

public class Employee {
    private int employeeId;       
    private String employeeName;   
    private double salary;         
    private int departmentId;     

    private boolean checkedIn;       
    private boolean salaryReceived;   

    public Employee(int employeeId, String employeeName, double salary, int departmentId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.departmentId = departmentId;
        this.checkedIn = false;
        this.salaryReceived = false;
    }

    public void employeeDetails() {
        System.out.printf("Employee ID: %d, Name: %s, Department ID: %d, Salary: %.2f%n",
                employeeId, employeeName, departmentId, salary);
    }

    public boolean checkIn() {
        return checkedIn;
    }

    public void setCheckIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public boolean receiveSalary() {
        return salaryReceived;
    }

    public void setSalaryReceived(boolean salaryReceived) {
        this.salaryReceived = salaryReceived;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
