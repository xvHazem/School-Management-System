package schoolmanagement;

class HigherSecondaryStudent extends Student {
    public HigherSecondaryStudent(int studentId, String studentName, int classId, String section, int busId) {
        super(studentId, studentName, classId, section, busId);
        this.fees = 8000; // Higher secondary student fees
    }
    
    @Override
    public void studentDetails() {
        System.out.println("Student ID: " + studentId + " | Name: " + studentName + " | Type: Higher Secondary");
        System.out.println("Class: " + classId + " | Section: " + section + " | Bus ID: " + busId);
        System.out.println("Fees: " + fees + " | Paid: " + (feesPaid ? "Yes" : "No"));
        System.out.println("---");
    }
}
