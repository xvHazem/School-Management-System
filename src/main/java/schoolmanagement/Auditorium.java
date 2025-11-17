package schoolmanagement;

public class Auditorium {
    private int totalSeats;
    private int seatsOccupied;
    private String eventName;
    private String eventDate;
    private String eventTime;

    public Auditorium(int totalSeats) {
        this.totalSeats = totalSeats;
        this.seatsOccupied = 0;
        this.eventName = null;
        this.eventDate = null;
        this.eventTime = null;
    }

    public void bookAuditorium(String eventName, String eventDate, String eventTime, int seatsToBook) {
        if (seatsOccupied + seatsToBook <= totalSeats) {
            this.eventName = eventName;
            this.eventDate = eventDate;
            this.eventTime = eventTime;
            seatsOccupied += seatsToBook;
            System.out.println(seatsToBook + " seats are booked successfully.");
        } else {
            System.out.println("Not enough available seats.");
        }
    }

    public void eventDetails() {
        System.out.printf("Event: %s, Date: %s, Time: %s%n", eventName, eventDate, eventTime);
    }

    public void displaySeats() {
        System.out.printf("Total seats: %d, Seats occupied: %d, Seats available: %d%n",
                          totalSeats, seatsOccupied, totalSeats - seatsOccupied);
    }

    // Getters and Setters

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getSeatsOccupied() {
        return seatsOccupied;
    }

    public void setSeatsOccupied(int seatsOccupied) {
        this.seatsOccupied = seatsOccupied;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }
}
