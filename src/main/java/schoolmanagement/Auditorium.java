package schoolmanagement;

public class Auditorium {
    private String auditoriumId;
    private String auditoriumName;
    private int capacity;

    public Auditorium(String auditoriumId, String auditoriumName, int capacity) {
        this.auditoriumId = auditoriumId;
        this.auditoriumName = auditoriumName;
        this.capacity = capacity;
    }

    public void auditoriumDetails() {
        System.out.println("Auditorium: " + auditoriumName + ", Capacity: " + capacity);
    }
}
