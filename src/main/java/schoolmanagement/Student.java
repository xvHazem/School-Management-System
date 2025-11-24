package schoolmanagement;

abstract class Student {
    protected int studentId;
    protected String studentName;
    protected int classId;
    protected String section;
    protected int busId;
    protected double fees;
    protected boolean feesPaid;
    // Unidirectional Associations
    protected Classroom classroom;
    protected Bus bus;
    protected Playground playground;
    protected NoticeBoard noticeBoard;
    
    public Student(int studentId, String studentName, int classId, String section, int busId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.classId = classId;
        this.section = section;
        this.busId = busId;
        this.fees = 0;
        this.feesPaid = false;
        this.classroom = null;
        this.bus = null;
        this.playground = null;
        this.noticeBoard = null;
    }
    
    public abstract void studentDetails();
    
    public void payFees() {
        System.out.println("Current Fees: " + fees);
        feesPaid = true;
        System.out.println(" Fees paid successfully!");
    }
    
    // Unidirectional Association Methods
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    
    public void setBus(Bus bus) {
        this.bus = bus;
    }
    
    public void setPlayground(Playground playground) {
        this.playground = playground;
    }
    
    public void setNoticeBoard(NoticeBoard noticeBoard) {
        this.noticeBoard = noticeBoard;
    }
    
    public Classroom getClassroom() { return classroom; }
    public Bus getBus() { return bus; }
    public Playground getPlayground() { return playground; }
    public NoticeBoard getNoticeBoard() { return noticeBoard; }
    
    public int getStudentId() { return studentId; }
    public String getStudentName() { return studentName; }
    public int getClassId() { return classId; }
}

