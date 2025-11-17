package schoolmanagement;

public class Bus {
    private String busId;
    private String busDriverName;
    private int capacity;

    public Bus(String busId, String busDriverName, int capacity) {
        this.busId = busId;
        this.busDriverName = busDriverName;
        this.capacity = capacity;
    }

    public void busDetails() {
        System.out.println("Bus ID: " + busId + ", Driver: " + busDriverName + ", Capacity: " + capacity);
    }
}
