package schoolmanagement;

public class Playground {
    private double area;
    private int classId;

    public Playground(double area, int classId) {
        this.area = area;
        this.classId = classId;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public boolean isOccupied() {
        // تحقق من الإشغال حسب المتطلبات
        // (مثلاً إرجاع true إذا كان classId ليس صفر)
        return classId != 0;
    }
}
