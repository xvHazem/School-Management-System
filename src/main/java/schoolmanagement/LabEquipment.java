package schoolmanagement;

class LabEquipment extends Equipment {
    private String equipmentName;
    private int equipmentCount;
    
    public LabEquipment(int equipmentId, String equipmentName, int equipmentCount, double cost) {
        super(equipmentId, cost);
        this.equipmentName = equipmentName;
        this.equipmentCount = equipmentCount;
    }
    
    @Override
    public void equipmentDetails() {
        System.out.println("Equipment: " + equipmentName + " | Count: " + equipmentCount + " | Cost: " + cost);
    }
    
    public String getEquipmentName() { return equipmentName; }
    public int getEquipmentCount() { return equipmentCount; }
}