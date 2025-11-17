package schoolmanagement;

public class Student {
    private int studentId;
    private String studentName;
    private int classId;
    private String section;
    private int busId;
    private double totalFees;
    private double feesPaid;

    public Student(int studentId, String studentName, int classId, String section, int busId, double totalFees) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.classId = classId;
        this.section = section;
        this.busId = busId;
        this.totalFees = totalFees;
        this.feesPaid = 0;
    }

    public void studentDetails() {
        System.out.printf("Student ID: %d, Name: %s, Class ID: %d, Section: %s, Bus ID: %d%n",
                studentId, studentName, classId, section, busId);
    }

    public void payFees(double amount) {
        feesPaid += amount;
        System.out.println("Payment successful. Total Amount Paid: " + feesPaid);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(double feesPaid) {
        this.feesPaid = feesPaid;
    }
}
