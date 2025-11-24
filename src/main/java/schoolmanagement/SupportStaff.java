package schoolmanagement;

class SupportStaff extends Employee {
    public SupportStaff(int employeeId, String employeeName, double salary, int departmentId) {
        super(employeeId, employeeName, salary, departmentId);
    }
    
    @Override
    public void employeeDetails() {
        System.out.println("Staff ID: " + employeeId + " | Name: " + employeeName);
        System.out.println("Department: " + departmentId + " | Salary: " + salary);
        System.out.println("Checked In: " + (checkedIn ? "Yes" : "No") + " | Salary Received: " + (salarySalaryReceived ? "Yes" : "No"));
        System.out.println("---");
    }
}
