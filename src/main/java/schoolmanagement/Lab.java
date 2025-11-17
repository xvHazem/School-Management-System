package schoolmanagement;
import java.util.List;

public class Lab {
    private int labId;
    private int inchargeId;
    private String labName;
    private boolean occupied; 
    
    private List<LabEquipment> equipments;


    public Lab(int labId, int inchargeId, String labName, boolean occupied) {
        this.labId = labId;
        this.inchargeId = inchargeId;
        this.labName = labName;
        this.occupied = occupied;
    }

    public void labDetails(String inchargeName) {
        System.out.printf("Lab ID: %d, Lab Name: %s, Incharge ID: %d, Incharge Name: %s%n",
                labId, labName, inchargeId, inchargeName);
    }
 
    public boolean isOccupied() {
        return occupied;
    }

    public void payFine(int studentId, double fineAmount) {
        System.out.printf("Student ID %d has a fine of %.2f for lab damages%n", studentId, fineAmount);
    }
 
    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }

    public int getInchargeId() {
        return inchargeId;
    }

    public void setInchargeId(int inchargeId) {
        this.inchargeId = inchargeId;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public boolean isOccupiedFlag() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
