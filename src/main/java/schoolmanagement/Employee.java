package schoolmanagement;

abstract class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;
    protected int departmentId;
    protected boolean checkedIn;
    protected boolean salarySalaryReceived;
    
    public Employee(int employeeId, String employeeName, double salary, int departmentId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.departmentId = departmentId;
        this.checkedIn = false;
        this.salarySalaryReceived = false;
    }
    
    public abstract void employeeDetails();
    
    public void checkIn() {
        this.checkedIn = true;
        System.out.println(" Checked in successfully!");
    }
    
    public void receiveSalary() {
        this.salarySalaryReceived = true;
        System.out.println(" Salary of " + salary + " received!");
    }
    
    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
}
