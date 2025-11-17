package schoolmanagement;

public class SchoolManagement {
    private String schoolName;
    private String address;
    private String contactNumber;
    private String mediumOfStudy;
    private boolean isOpen;

    public SchoolManagement(String schoolName, String address, String contactNumber, String mediumOfStudy, boolean isOpen) {
        this.schoolName = schoolName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.mediumOfStudy = mediumOfStudy;
        this.isOpen = isOpen;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void schoolDetails() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Medium of Study: " + mediumOfStudy);
        System.out.println("Is the school open? " + (isOpen ? "Yes" : "No"));
    }
}

