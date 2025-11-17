package schoolmanagement;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolManagement {
    private String schoolName;
    private String address;
    private String contactNumber;
    private String mediumOfStudy;
    private boolean isOpen;
   
    private List<Student> students;
    private List<Bus> buses;
    private List<Playground> playgrounds;
    private Auditorium auditorium;
    private Playground playground;
    private List<Classroom> classrooms;
    private List<Lab> labs;
    private List<Employee> employees;
    private NoticeBoard noticeBoard;

//
    public SchoolManagement(String schoolName, String address, String contactNumber, String mediumOfStudy, boolean isOpen) {
    this.schoolName = schoolName;
    this.address = address;
    this.contactNumber = contactNumber;
    this.mediumOfStudy = mediumOfStudy;
    this.isOpen = isOpen;
    this.students = new ArrayList<>();
    this.buses = new ArrayList<>();
    this.playgrounds = new ArrayList<>();
    this.classrooms = new ArrayList<>();
    this.labs = new ArrayList<>();
    this.employees = new ArrayList<>();
    this.noticeBoard = new NoticeBoard(new ArrayList<>(), "Admin");
}


    public void schoolDetails() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Medium of Study: " + mediumOfStudy);
        System.out.println("Is the school open? " + (isOpen ? "Yes" : "No"));
    }
    public void initialize(Auditorium auditorium, Playground playground, NoticeBoard noticeBoard,
                        List<Employee> employees, List<Classroom> classrooms, List<Lab> labs) {
    this.auditorium = auditorium;
    this.playground = playground;
    this.noticeBoard = noticeBoard;
    this.employees = employees;
    this.classrooms = classrooms;
    this.labs = labs;
}
    
        public String getSchoolName() {
    return schoolName;
}

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getContactNumber() {
    return contactNumber;
}

public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
}

public String getMediumOfStudy() {
    return mediumOfStudy;
}

public void setMediumOfStudy(String mediumOfStudy) {
    this.mediumOfStudy = mediumOfStudy;
}

public boolean isOpen() {
    return isOpen;
}

public void setOpen(boolean open) {
    this.isOpen = open;
}

public List<Student> getStudents() {
    return students;
}

public void setStudents(List<Student> students) {
    this.students = students;
}

public List<Bus> getBuses() {
    return buses;
}

public void setBuses(List<Bus> buses) {
    this.buses = buses;
}

public List<Playground> getPlaygrounds() {
    return playgrounds;
}

public void setPlaygrounds(List<Playground> playgrounds) {
    this.playgrounds = playgrounds;
}

public Auditorium getAuditorium() {
    return auditorium;
}

public void setAuditorium(Auditorium auditorium) {
    this.auditorium = auditorium;
}

public Playground getPlayground() {
    return playground;
}

public void setPlayground(Playground playground) {
    this.playground = playground;
}

public List<Classroom> getClassrooms() {
    return classrooms;
}

public void setClassrooms(List<Classroom> classrooms) {
    this.classrooms = classrooms;
}

public List<Lab> getLabs() {
    return labs;
}

public void setLabs(List<Lab> labs) {
    this.labs = labs;
}

public List<Employee> getEmployees() {
    return employees;
}

public void setEmployees(List<Employee> employees) {
    this.employees = employees;
}

public NoticeBoard getNoticeBoard() {
    return noticeBoard;
}

public void setNoticeBoard(NoticeBoard noticeBoard) {
    this.noticeBoard = noticeBoard;
}

public void runSchool() {
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {
        System.out.println("\n--- School Management Menu ---");
        System.out.println("A- Bus");
        System.out.println("B- Student");
        System.out.println("C- Employee");
        System.out.println("D- Class");
        System.out.println("E- NoticeBoard");
        System.out.println("F- Auditorium");
        System.out.println("G- ShowSchoolDetails");
        System.out.println("H- Exit");
        System.out.print("Enter your choice: ");

        String choice = scanner.nextLine().toUpperCase();

        switch (choice) {
            case "A":
                runBusMenu(scanner);
                break;
            case "B":
                // runStudentMenu(scanner);
                System.out.println("Student menu will be implemented.");
                break;
            case "C":
                // runEmployeeMenu(scanner);
                System.out.println("Employee menu will be implemented.");
                break;
            case "D":
                System.out.println("Class menu will be implemented.");
                break;
            case "E":
                System.out.println("NoticeBoard menu will be implemented.");
                break;
            case "F":
                System.out.println("Auditorium menu will be implemented.");
                break;
            case "G":
                schoolDetails();
                break;
            case "H":
                System.out.println("Exiting system. Goodbye!");
                exit = true;
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }
    scanner.close();
}

// مثال دالة للقائمة الفرعية الخاصة بالباص
private void runBusMenu(Scanner scanner) {
    boolean back = false;
    while (!back) {
        System.out.println("\n-- Bus Menu --");
        System.out.println("1- Add Bus");
        System.out.println("2- Show Bus Details");
        System.out.println("3- Show Seats");
        System.out.println("4- Go Back");
        System.out.print("Enter your choice: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                // هنا يمكنك كتابة منطق إضافة الباص
                System.out.println("Adding a bus (functionality not implemented yet).");
                break;
            case "2":
                System.out.println("Showing all bus details:");
                for (Bus bus : buses) {
                    bus.busDetails();
                }
                break;
            case "3":
                System.out.println("Showing seats info for all buses:");
                for (Bus bus : buses) {
                    bus.showSeats();
                }
                break;
            case "4":
                back = true;
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }
}

}

