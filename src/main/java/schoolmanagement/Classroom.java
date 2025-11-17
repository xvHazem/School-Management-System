package schoolmanagement;

public class Classroom {
    private int classId;
    private String className;
    private int teacherId;
    private int studentCount;
    private int equipmentId;

    public Classroom(int classId, String className, int teacherId, int studentCount, int equipmentId) {
        this.classId = classId;
        this.className = className;
        this.teacherId = teacherId;
        this.studentCount = studentCount;
        this.equipmentId = equipmentId;
    }

    public void classDetails() {
        System.out.printf("Classroom ID: %d, Name: %s, Teacher ID: %d, Student Count: %d, Equipment ID: %d%n",
            classId, className, teacherId, studentCount, equipmentId);
    }
    
    // Getters and Setters
    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }
}

