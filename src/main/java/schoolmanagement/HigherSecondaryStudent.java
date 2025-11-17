package schoolmanagement;

public class HigherSecondaryStudent extends Student {
    private int standard; // 11 أو 12

    public HigherSecondaryStudent(int studentId, String studentName, int classId, String section, int busId, double totalFees, int standard) {
        super(studentId, studentName, classId, section, busId, totalFees);
        this.standard = standard;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public void studentDetails() {
        super.studentDetails();
        System.out.println("Standard Class: " + standard);
    }
}
