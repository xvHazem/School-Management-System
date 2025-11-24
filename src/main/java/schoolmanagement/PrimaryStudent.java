package schoolmanagement;

class PrimaryStudent extends Student {
    public PrimaryStudent(int studentId, String studentName, int classId, String section, int busId) {
        super(studentId, studentName, classId, section, busId);
        this.fees = 5000; // Primary student fees
    }
    
    @Override
    public void studentDetails() {
        System.out.println("Student ID: " + studentId + " | Name: " + studentName + " | Type: Primary");
        System.out.println("Class: " + classId + " | Section: " + section + " | Bus ID: " + busId);
        System.out.println("Fees: " + fees + " | Paid: " + (feesPaid ? "Yes" : "No"));
        System.out.println("---");
    }
}
