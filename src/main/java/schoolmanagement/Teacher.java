package schoolmanagement;

public class Teacher extends Employee {
    private String subject;

    public Teacher(int employeeId, String employeeName, double salary, int departmentId, String subject) {
        super(employeeId, employeeName, salary, departmentId);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void employeeDetails() {
        super.employeeDetails();
        System.out.println("Subject: " + subject);
    }
}
