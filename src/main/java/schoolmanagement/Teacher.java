package schoolmanagement;

import java.util.*;

class Teacher extends Employee {
    public Teacher(int employeeId, String employeeName, double salary, int departmentId) {
        super(employeeId, employeeName, salary, departmentId);
            this.students = new ArrayList<>();
    }

    
    private List<Student> students;
    // Not implemented in Program yet
      public void addStudent(Student student) {
        this.students.add(student);
    }
    @Override
    public void employeeDetails() {
        System.out.println("Teacher ID: " + employeeId + " | Name: " + employeeName);
        System.out.println("Department: " + departmentId + " | Salary: " + salary);
        System.out.println("Checked In: " + (checkedIn ? "Yes" : "No") + " | Salary Received: " + (salarySalaryReceived ? "Yes" : "No"));
        System.out.println("---");
    }
}