package schoolmanagement;

abstract class Equipment {
    protected int equipmentId;
    protected double cost;
    
    public Equipment(int equipmentId, double cost) {
        this.equipmentId = equipmentId;
        this.cost = cost;
    }
    
    public abstract void equipmentDetails();
    
    public void purchaseEquipment(int quantity) {
        System.out.println(" Purchased " + quantity + " equipment items");
    }
    
    public void repair() {
        System.out.println(" Equipment repaired successfully!");
    }
    
    public int getEquipmentId() { return equipmentId; }
    public double getCost() { return cost; }
}