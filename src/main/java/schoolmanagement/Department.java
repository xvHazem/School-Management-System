package schoolmanagement;

import java.util.*;

class Department {
    private int departmentId;
    private String departmentName;
    private String inchargeName;
    private List<String> memberList;
    
    public Department(int departmentId, String departmentName, String inchargeName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.inchargeName = inchargeName;
        this.memberList = new ArrayList<>();
    }
    
    public void departmentDetails() {
        System.out.println("Department ID: " + departmentId + " | Name: " + departmentName);
        System.out.println("Incharge: " + inchargeName);
        System.out.println("Members: " + memberList);
    }
}