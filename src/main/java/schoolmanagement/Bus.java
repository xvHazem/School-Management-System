package schoolmanagement;

class Bus {
    private int busId;
    private int driverId;
    private int capacity;
    private String busNumber;
    private String areaList;
    private int seatsOccupied;
    
    public Bus(int busId, int driverId, int capacity, String busNumber, String areaList) {
        this.busId = busId;
        this.driverId = driverId;
        this.capacity = capacity;
        this.busNumber = busNumber;
        this.areaList = areaList;
        this.seatsOccupied = 0;
    }
    
    public void busDetails() {
        System.out.println("\nBus ID: " + busId + " | Number: " + busNumber);
        System.out.println("Driver ID: " + driverId);
        System.out.println("Capacity: " + capacity + " | Occupied: " + seatsOccupied);
        System.out.println("Areas: " + areaList);
    }
    
    public void showSeats() {
        System.out.println("Total Seats: " + capacity);
        System.out.println("Available Seats: " + (capacity - seatsOccupied));
    }
    
    public void addPassenger() {
        if (seatsOccupied < capacity) {
            seatsOccupied++;
        } else {
        System.out.println("Bus is already full!");
        }
    }

    public int getBusId() { return busId; }
}