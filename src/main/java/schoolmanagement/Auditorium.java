package schoolmanagement;

class Auditorium {
    private int totalSeats;
    private int seatsOccupied;
    private String eventName;
    private String eventDate;
    private String eventTime;
    
    public Auditorium(int totalSeats) {
        this.totalSeats = totalSeats;
        this.seatsOccupied = 0;
    }
    
    public void bookAuditorium(String eventName, String eventDate, String eventTime, int participants) {
        if (participants <= (totalSeats - seatsOccupied)) {
            this.eventName = eventName;
            this.eventDate = eventDate;
            this.eventTime = eventTime;
            this.seatsOccupied += participants;
            System.out.println(" Auditorium booked successfully!");
        } else {
            System.out.println("✗ Not enough seats available!");
        }
    }
    
    public void eventDetails(String date) {
        if (date.equals(eventDate)) {
            System.out.println("\nEvent: " + eventName);
            System.out.println("Date: " + eventDate);
            System.out.println("Time: " + eventTime);
            System.out.println("Seats Occupied: " + seatsOccupied);
        } else {
            System.out.println("No event on this date");
        }
    }
    
    public void displaySeats() {
        System.out.println("\nAuditorium Seats");
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Occupied: " + seatsOccupied);
        System.out.println("Available: " + (totalSeats - seatsOccupied));
    }
}
