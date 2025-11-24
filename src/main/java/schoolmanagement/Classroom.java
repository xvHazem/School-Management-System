package schoolmanagement;

import java.util.*;

class Classroom {
    private int classId;
    private String className;
    private int teacherId;
    private int studentCount;
    private List<Integer> studentIds;
    private ClassEquipment classEquipment;
    
    public Classroom(int classId, String className, int studentCount, ClassEquipment classEquipment) {
        this.classId = classId;
        this.className = className;
        this.studentCount = studentCount;
        this.classEquipment = classEquipment;
        this.studentIds = new ArrayList<>();
        this.teacherId = 0;
    }
    
    public void classDetails() {
        System.out.println("\n--- Class Details ---");
        System.out.println("Class ID: " + classId + " | Name: " + className);
        System.out.println("Teacher ID: " + (teacherId == 0 ? "Not Assigned" : teacherId));
        System.out.println("Total Seats: " + studentCount + " | Occupied: " + studentIds.size());
        System.out.println("Equipment - Benches: " + classEquipment.getBenchCount() + 
                          ", Fans: " + classEquipment.getFanCount() + 
                          ", Lights: " + classEquipment.getLightCount());
    }
    
    public void addStudent(int studentId) {
        if (studentIds.size() < studentCount) {
            studentIds.add(studentId);
            System.out.println(" Student added to class!");
        } else {
            System.out.println("✗ Class is full!");
        }
    }
    
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
        System.out.println(" Teacher assigned!");
    }
    
    public int getClassId() { return classId; }
    public String getClassName() { return className; }
    public int getTeacherId() { return teacherId; }
}
