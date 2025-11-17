package schoolmanagement;

import java.util.List;

public class Department {
    private int departmentId;
    private String departmentName;
    private String inchargeName;
    private List<Integer> memberList; // قائمة معرفات أعضاء القسم

    public Department(int departmentId, String departmentName, String inchargeName, List<Integer> memberList) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.inchargeName = inchargeName;
        this.memberList = memberList;
    }

    public void departmentDetails() {
        System.out.printf("Department ID: %d, Name: %s, Incharge: %s, Members: %s%n",
                          departmentId, departmentName, inchargeName, memberList.toString());
    }

    // Getters and Setters

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getInchargeName() {
        return inchargeName;
    }

    public void setInchargeName(String inchargeName) {
        this.inchargeName = inchargeName;
    }

    public List<Integer> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Integer> memberList) {
        this.memberList = memberList;
    }
}
