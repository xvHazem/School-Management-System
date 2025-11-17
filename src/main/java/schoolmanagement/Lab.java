package schoolmanagement;

public class Lab {
    private String labId;
    private String inchargeId;
    private String labName;
    private String equipmentId;
    private boolean occupied;

    public Lab(String labId, String inchargeId, String labName, String equipmentId, boolean occupied) {
        this.labId = labId;
        this.inchargeId = inchargeId;
        this.labName = labName;
        this.equipmentId = equipmentId;
        this.occupied = occupied;
    }

    public void labDetails() {
        System.out.println("Lab Name: " + labName + ", Incharge: " + inchargeId + ", Occupied: " + occupied);
    }

    public boolean isOccupied() {
        return occupied;
    }
}
