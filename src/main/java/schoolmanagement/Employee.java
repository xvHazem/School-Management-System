package schoolmanagement;

public class Employee {
    // الخصائص - بيانات كل موظف
    private int employeeId;        // رقم الموظف
    private String employeeName;   // اسم الموظف
    private double salary;         // راتب الموظف
    private int departmentId;      // رقم قسم الموظف

    private boolean checkedIn;        // حالة تسجيل الدخول
    private boolean salaryReceived;   // حالة استلام الراتب

    // الكونستركتور
    public Employee(int employeeId, String employeeName, double salary, int departmentId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.departmentId = departmentId;
        this.checkedIn = false;
        this.salaryReceived = false;
    }

    // يعرض تفاصيل الموظف مع الراتب والقسم
    public void employeeDetails() {
        System.out.printf("Employee ID: %d, Name: %s, Department ID: %d, Salary: %.2f%n",
                employeeId, employeeName, departmentId, salary);
    }

    // هل الموظف سجل الدخول؟
    public boolean checkIn() {
        return checkedIn;
    }

    // تغيير حالة تسجيل الدخول
    public void setCheckIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    // هل الموظف استلم راتبه؟
    public boolean receiveSalary() {
        return salaryReceived;
    }

    // تغيير حالة استلام الراتب
    public void setSalaryReceived(boolean salaryReceived) {
        this.salaryReceived = salaryReceived;
    }

    // getters و setters للخصائص

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
