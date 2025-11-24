package schoolmanagement;

import java.util.*;

class Lab {
    private int labId;
    private int inchargeId;
    private String labName;
    private List<LabEquipment> equipments; // Composition - Equipment belongs to Lab
    private boolean isOccupied;
    
    public Lab(int labId, String labName, List<LabEquipment> equipments) {
        this.labId = labId;
        this.labName = labName;
        this.equipments = equipments;
        this.isOccupied = false;
        this.inchargeId = 0;
    }
    
    public void labDetails() {
        System.out.println("\nLab ID: " + labId + " | Name: " + labName);
        System.out.println("Incharge ID: " + inchargeId);
        System.out.println("Occupied: " + (isOccupied ? "Yes" : "No"));
        System.out.println("Equipments:");
        for (LabEquipment eq : equipments) {
            eq.equipmentDetails();
        }
    }
    
    public boolean isOccupied() { return isOccupied; }
    
    public void payFine(double amount) {
        System.out.println("Fine of " + amount + " has been charged for equipment damage!");
    }
    
    public int getLabId() { return labId; }
    public List<LabEquipment> getEquipments() { return equipments; }
}
