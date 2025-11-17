package schoolmanagement;

public class Equipment {
    private String equipmentId;
    private String equipmentName;
    private String status;

    public Equipment(String equipmentId, String equipmentName, String status) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.status = status;
    }

    public void equipmentDetails() {
        System.out.println("Equipment: " + equipmentName + ", Status: " + status);
    }
}
