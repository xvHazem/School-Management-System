package schoolmanagement;

import java.util.List;

public class Department {
    private String departmentId;
    private String departmentName;
    private String inchargeName;
    private List<String> memberList;

    public Department(String departmentId, String departmentName, String inchargeName, List<String> memberList) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.inchargeName = inchargeName;
        this.memberList = memberList;
    }

    public void departmentDetails() {
        System.out.println("Department: " + departmentName + ", Incharge: " + inchargeName);
        System.out.println("Members: " + memberList);
    }
}
