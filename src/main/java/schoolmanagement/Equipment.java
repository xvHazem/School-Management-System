package schoolmanagement;

public class Equipment {
    private int equipmentId;
    private double cost;

    public Equipment(int equipmentId, double cost) {
        this.equipmentId = equipmentId;
        this.cost = cost;
    }

    // يعرض تفاصيل المعدات
    public void equipmentDetails() {
        System.out.printf("Equipment ID: %d, Cost: %.2f%n", equipmentId, cost);
    }

    // شراء المعدات الجديدة وتحديث التفاصيل
    public void purchaseEquipment(int equipmentId, double cost) {
        this.equipmentId = equipmentId;
        this.cost = cost;
        System.out.println("New equipment purchased with ID: " + equipmentId + " and cost: " + cost);
    }

    // إصلاح المعدات
    public void repair() {
        System.out.println("Equipment with ID: " + equipmentId + " has been repaired.");
    }

    // Getters and Setters
    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
