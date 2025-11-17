package schoolmanagement;

public class Classroom {
    private String classId;
    private String className;
    private String teacherId;
    private int studentCount;
    private String equipmentId;

    public Classroom(String classId, String className, String teacherId, int studentCount, String equipmentId) {
        this.classId = classId;
        this.className = className;
        this.teacherId = teacherId;
        this.studentCount = studentCount;
        this.equipmentId = equipmentId;
    }

    public void classDetails() {
        System.out.println("Class ID: " + classId);
        System.out.println("Class Name: " + className);
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Number of Students: " + studentCount);
        System.out.println("Equipment ID: " + equipmentId);
    }
}
