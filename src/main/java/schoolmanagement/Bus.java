package schoolmanagement;

import java.util.List;

public class Bus {
    private int busId;
    private int driverId;
    private List<String> areaList;
    private String busNumber;
    private int capacity;

    public Bus(int busId, int driverId, List<String> areaList, String busNumber, int capacity) {
        this.busId = busId;
        this.driverId = driverId;
        this.areaList = areaList;
        this.busNumber = busNumber;
        this.capacity = capacity;
    }

    public void busDetails() {
        System.out.printf("Bus ID: %d, Driver ID: %d, Bus Number: %s, Capacity: %d, Areas: %s%n",
                          busId, driverId, busNumber, capacity, String.join(", ", areaList));
    }

    public void showSeats() {
        System.out.println("Bus capacity: " + capacity);
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public List<String> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<String> areaList) {
        this.areaList = areaList;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
