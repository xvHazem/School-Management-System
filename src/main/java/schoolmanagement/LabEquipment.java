package schoolmanagement;

public class LabEquipment extends Equipment {
    private String equipmentName;
    private int equipmentCount;

    public LabEquipment(int equipmentId, double cost, String equipmentName, int equipmentCount) {
        super(equipmentId, cost);
        this.equipmentName = equipmentName;
        this.equipmentCount = equipmentCount;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public int getEquipmentCount() {
        return equipmentCount;
    }

    public void setEquipmentCount(int equipmentCount) {
        this.equipmentCount = equipmentCount;
    }

    @Override
    public void equipmentDetails() {
        super.equipmentDetails();
        System.out.println("Equipment Name: " + equipmentName);
        System.out.println("Equipment Count: " + equipmentCount);
    }
}
