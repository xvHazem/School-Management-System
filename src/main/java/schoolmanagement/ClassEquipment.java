package schoolmanagement;

class ClassEquipment extends Equipment {
    private int benchCount;
    private int fanCount;
    private int lightCount;
    
    public ClassEquipment(int equipmentId, int benchCount, int fanCount, int lightCount) {
        super(equipmentId, 0);
        this.benchCount = benchCount;
        this.fanCount = fanCount;
        this.lightCount = lightCount;
    }
    
    @Override
    public void equipmentDetails() {
        System.out.println("Class Equipment - Benches: " + benchCount + ", Fans: " + fanCount + ", Lights: " + lightCount);
    }
    
    public int getBenchCount() { return benchCount; }
    public int getFanCount() { return fanCount; }
    public int getLightCount() { return lightCount; }
}