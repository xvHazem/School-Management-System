package schoolmanagement;

import java.util.*;

class SchoolManagement {
    private String schoolName;
    private String address;
    private String contactNumber;
    private String mediumOfStudy;
    private Auditorium auditorium;
    private Playground playground;
    private NoticeBoard noticeBoard;
    private List<Teacher> teachers;
    private List<SupportStaff> supportStaffs;
    private Classroom[] classrooms;
    private Lab[] labs;
    private List<Bus> buses;
    private List<Student> students;
    private List<Department> departments;
    
    public SchoolManagement(String schoolName, String address, String contactNumber, String mediumOfStudy) {
        this.schoolName = schoolName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.mediumOfStudy = mediumOfStudy;
        this.buses = new ArrayList<>();
        this.departments = new ArrayList<>();   
        this.students = new ArrayList<>();
    }
    
    public void initialize(Auditorium auditorium, Playground playground, NoticeBoard noticeBoard,
                          List<Teacher> teachers, List<SupportStaff> supportStaffs, Classroom[] classrooms, Lab[] labs) {
        this.auditorium = auditorium;
        this.playground = playground;
        this.noticeBoard = noticeBoard;
        this.teachers = teachers;
        this.supportStaffs = supportStaffs;
        this.classrooms = classrooms;
        this.labs = labs;
    }
    
    public boolean isOpen() {
        return true;
    }
    
    public void schoolDetails() {
        System.out.println("\n-----------------------------------------");
        System.out.println("-        SCHOOL DETAILS                  -");
        System.out.println("-----------------------------------------");
        System.out.println("School Name: " + schoolName);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Medium of Study: " + mediumOfStudy);
        System.out.println("Status: " + (isOpen() ? "OPEN" : "CLOSED"));
        System.out.println("Total Students: " + students.size());
        System.out.println("Total Teachers: " + teachers.size());
        System.out.println("Total Support Staff: " + supportStaffs.size());
        System.out.println("Total Buses: " + buses.size());
        System.out.println("Total Classrooms: " + classrooms.length);
        System.out.println("Total Labs: " + labs.length);
    }
    
    public void runSchool(Scanner scanner) {
        boolean running = true;
        
        while (running) {
            System.out.println("\n-----------------------------------------");
            System.out.println("-      SCHOOL MANAGEMENT MENU            -");
            System.out.println("-----------------------------------------");
            System.out.println("A. Bus Management");
            System.out.println("B. Student Management");
            System.out.println("C. Employee Management");
            System.out.println("D. Classroom Management");
            System.out.println("E. Notice Board");
            System.out.println("F. Auditorium");
            System.out.println("G. Show School Details");
            System.out.println("H. Exit");
            System.out.print("Choose option: ");
            
            String choice = scanner.nextLine().toUpperCase();
            
            switch (choice) {
                case "A" -> busMgmt(scanner);
                case "B" -> studentMgmt(scanner);
                case "C" -> employeeMgmt(scanner);
                case "D" -> classroomMgmt(scanner);
                case "E" -> noticeBoardMgmt(scanner);
                case "F" -> auditoriumMgmt(scanner);
                case "G" -> schoolDetails();
                case "H" -> {
                    running = false;
                    System.out.println("\nThank you for using School Management System!");
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
    
    private void busMgmt(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Bus Management ---");
            System.out.println("1. Add Bus");
            System.out.println("2. Show Bus Details");
            System.out.println("3. Show Seats");
            System.out.println("4. Go Back");
            System.out.print("Choose option: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1" -> {
                    System.out.print("Enter Bus Number: ");
                    String busNumber = scanner.nextLine();
                    System.out.print("Enter Driver ID(Numbers): ");
                    int driverId = scanner.nextInt();
                    System.out.print("Enter Capacity: ");
                    int capacity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Areas (comma separated): ");
                    String areaList = scanner.nextLine();
                    buses.add(new Bus(buses.size() + 1, driverId, capacity, busNumber, areaList));
                    System.out.println(" Bus added successfully!");
                }
                case "2" -> {
                    for (Bus bus : buses) {
                        bus.busDetails();
                    }
                }
                case "3" -> {
                    System.out.print("Enter Bus ID: ");
                    int busId = scanner.nextInt();
                    scanner.nextLine();
                    for (Bus bus : buses) {
                        if (bus.getBusId() == busId) {
                            bus.showSeats();
                            break;
                        }
                    }
                }
                case "4" -> back = true;
                default -> System.out.println("Invalid option!");
            }
        }
    }
    
    private void studentMgmt(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show Student Details");
            System.out.println("3. Pay Fee");
            System.out.println("4. Go Back");
            System.out.print("Choose option: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1" -> {
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Class ID: ");
                    int classId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Section: ");
                    String section = scanner.nextLine();
                    System.out.print("Enter Bus ID (or 0 for none): ");
                    int busId = scanner.nextInt();
                    if (busId != 0) {
                        Bus targetBus = null;
                        for (Bus bus : buses) {
                            if (bus.getBusId() == busId) {
                                targetBus = bus;
                                break;
                            }
                        }
                        
                        if (targetBus != null) {
                            targetBus.addPassenger();
                        } else {
                            System.out.println("Warning: Bus with ID " + busId + " not found. Student added without a bus.");
                            busId = 0; 
                        }
                    }
                    scanner.nextLine();
                    
                    System.out.print("Is this a Primary Student (P) or Higher Secondary (H)? ");
                    String type = scanner.nextLine().toUpperCase();
                    
                    if (type.equals("P")) {
                        students.add(new PrimaryStudent(students.size() + 1, name, classId, section, busId));
                    } else {
                        students.add(new HigherSecondaryStudent(students.size() + 1, name, classId, section, busId));
                    }
                    System.out.println(" Student added successfully!");
                }
                case "2" -> {
                    for (Student student : students) {
                        student.studentDetails();
                    }
                }
                case "3" -> {
                    System.out.print("Enter Student ID: ");
                    int stdId = scanner.nextInt();
                    scanner.nextLine();
                    for (Student student : students) {
                        if (student.getStudentId() == stdId) {
                            student.payFees();
                            break;
                        }
                    }
                }
                case "4" -> back = true;
                default -> System.out.println("Invalid option!");
            }
        }
    }
    
    private void employeeMgmt(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Teacher");
            System.out.println("2. Support Staff");
            System.out.println("3. Go Back");
            System.out.print("Choose option: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1" -> teacherMgmt(scanner);
                case "2" -> supportStaffMgmt(scanner);
                case "3" -> back = true;
                default -> System.out.println("Invalid option!");
            }
        }
    }
    
    private void teacherMgmt(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Teacher Management ---");
            System.out.println("1. Show Teacher Details");
            System.out.println("2. Receive Salary");
            System.out.println("3. Check In");
            System.out.println("5. Go Back");
            System.out.print("Choose option: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1" -> {
                    for (Teacher teacher : teachers) {
                        teacher.employeeDetails();
                    }
                }
                case "2" -> {
                    System.out.print("Enter Teacher ID: ");
                    int teacherId = scanner.nextInt();
                    scanner.nextLine();
                    for (Teacher teacher : teachers) {
                        if (teacher.getEmployeeId() == teacherId) {
                            teacher.receiveSalary();
                            break;
                        }
                    }
                }
                case "3" -> {
                    System.out.print("Enter Teacher ID: ");
                    int checkInId = scanner.nextInt();
                    scanner.nextLine();
                    for (Teacher teacher : teachers) {
                        if (teacher.getEmployeeId() == checkInId) {
                            teacher.checkIn();
                            break;
                        }
                    }
                }
                case "4" -> back = true;
                default -> System.out.println("Invalid option!");
            }
        }
    }
    
    private void supportStaffMgmt(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Support Staff Management ---");
            System.out.println("1. Show Staff Details");
            System.out.println("2. Receive Salary");
            System.out.println("3. Check In");
            System.out.println("4. Go Back");
            System.out.print("Choose option: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1" -> {
                    for (SupportStaff staff : supportStaffs) {
                        staff.employeeDetails();
                    }
                }
                case "2" -> {
                    System.out.print("Enter Staff ID: ");
                    int staffId = scanner.nextInt();
                    scanner.nextLine();
                    for (SupportStaff staff : supportStaffs) {
                        if (staff.getEmployeeId() == staffId) {
                            staff.receiveSalary();
                            break;
                        }
                    }
                }
                case "3" -> {
                    System.out.print("Enter Staff ID: ");
                    int checkInId = scanner.nextInt();
                    scanner.nextLine();
                    for (SupportStaff staff : supportStaffs) {
                        if (staff.getEmployeeId() == checkInId) {
                            staff.checkIn();
                            break;
                        }
                    }
                }
                case "4" -> back = true;
                default -> System.out.println("Invalid option!");
            }
        }
    }
    
    private void classroomMgmt(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Classroom Management ---");
            System.out.println("1. Add Student to Class");
            System.out.println("2. Assign Teacher");
            System.out.println("3. Show Class Details");
            System.out.println("4. Go Back");
            System.out.print("Choose option: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1" -> {
                    System.out.print("Enter Class ID: ");
                    int classId = scanner.nextInt();
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    if (classId > 0 && classId <= classrooms.length) {
                        classrooms[classId - 1].addStudent(studentId);
                    }
                }
                case "2" -> {
                    System.out.print("Enter Class ID: ");
                    int cId = scanner.nextInt();
                    System.out.print("Enter Teacher ID: ");
                    int tId = scanner.nextInt();
                    scanner.nextLine();
                    if (cId > 0 && cId <= classrooms.length) {
                        classrooms[cId - 1].setTeacherId(tId);
                    }
                }
                case "3" -> {
                    for (Classroom classroom : classrooms) {
                        classroom.classDetails();
                    }
                }
                case "4" -> back = true;
                default -> System.out.println("Invalid option!");
            }
        }
    }
    
    private void noticeBoardMgmt(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Notice Board ---");
            System.out.println("1. Display");
            System.out.println("2. Add Content");
            System.out.println("3. Go Back");
            System.out.print("Choose option: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1" -> noticeBoard.display();
                case "2" -> {
                    System.out.print("Enter news/content: ");
                    String content = scanner.nextLine();
                    noticeBoard.addContent(content);
                }
                case "3" -> back = true;
                default -> System.out.println("Invalid option!");
            }
        }
    }
    
    private void auditoriumMgmt(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Auditorium Management ---");
            System.out.println("1. Book Auditorium");
            System.out.println("2. Show Event Details");
            System.out.println("3. Show Seats");
            System.out.println("4. Go Back");
            System.out.print("Choose option: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1" -> {
                    System.out.print("Enter Event Name: ");
                    String eventName = scanner.nextLine();
                    System.out.print("Enter Event Date (YYYY-MM-DD): ");
                    String eventDate = scanner.nextLine();
                    System.out.print("Enter Event Time (HH:MM): ");
                    String eventTime = scanner.nextLine();
                    System.out.print("Enter Number of Participants: ");
                    int participants = scanner.nextInt();
                    scanner.nextLine();
                    auditorium.bookAuditorium(eventName, eventDate, eventTime, participants);
                }
                case "2" -> {
                    System.out.print("Enter Event Date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    auditorium.eventDetails(date);
                }
                case "3" -> auditorium.displaySeats();
                case "4" -> back = true;
                default -> System.out.println("Invalid option!");
            }
        }
    }
}
