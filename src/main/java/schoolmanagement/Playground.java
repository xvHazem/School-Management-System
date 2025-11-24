package schoolmanagement;

class Playground {
    private int area; // in square meters
    private int classId; // which class is using it
    private boolean isOccupied;
    
    public Playground(int area) {
        this.area = area;
        this.isOccupied = false;
        this.classId = 0;
    }
    
    public boolean isOccupied() {
        return isOccupied;
    }
    
    public void setOccupied(int classId) {
        this.isOccupied = true;
        this.classId = classId;
        System.out.println(" Playground is now occupied by class: " + classId);
    }
    
    public void setFree() {
        this.isOccupied = false;
        this.classId = 0;
        System.out.println(" Playground is now free");
    }
    
    public int getArea() { return area; }
    public int getClassId() { return classId; }
}
