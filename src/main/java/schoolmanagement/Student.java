package schoolmanagement;

public class Student {
    private String studentId;
    private String studentName;
    private String classId;
    private String section;
    private String busId;

    public Student(String studentId, String studentName, String classId, String section, String busId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.classId = classId;
        this.section = section;
        this.busId = busId;
    }

    public void studentDetails() {
        System.out.println("Student ID: " + studentId + ", Name: " + studentName + ", Class ID: " + classId);
    }

    public void payFees() {
        System.out.println(studentName + " has paid the fees.");
    }
}
