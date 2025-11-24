package schoolmanagement;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SchoolManagement school = null;
        
        System.out.println("\n-----------------------------------------");
        System.out.println("-  Welcome to School Management System -");
        System.out.println("-----------------------------------------");
        
        // Create School (First Time)
        System.out.println("\n--- School Creation ---");
        System.out.print("Enter School Name: ");
        String schoolName = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Contact Number: ");
        String contactNumber = scanner.nextLine();
        System.out.print("Enter Medium of Study (English/Arabic/Both): ");
        String mediumOfStudy = scanner.nextLine();
        
        school = new SchoolManagement(schoolName, address, contactNumber, mediumOfStudy);
        
        // Create Auditorium
        System.out.print("\nEnter Auditorium Total Seats: ");
        int totalSeats = scanner.nextInt();
        Auditorium auditorium = new Auditorium(totalSeats);
        
        // Create Playground
        System.out.print("Enter Playground Area (in sq meters): ");
        int playgroundArea = scanner.nextInt();
        Playground playground = new Playground(playgroundArea);
        
        // Create Classrooms
        System.out.print("\nHow many Classrooms? ");
        int classroomCount = scanner.nextInt();
        scanner.nextLine();
        Classroom[] classrooms = new Classroom[classroomCount];
        
        for (int i = 0; i < classroomCount; i++) {
            System.out.print("Enter Class Name (e.g., Class 1-A): ");
            String className = scanner.nextLine();
            System.out.print("Enter Student Count: ");
            int studentCount = scanner.nextInt();
            System.out.print("Enter Bench Count: ");
            int benchCount = scanner.nextInt();
            System.out.print("Enter Fan Count: ");
            int fanCount = scanner.nextInt();
            System.out.print("Enter Light Count: ");
            int lightCount = scanner.nextInt();
            scanner.nextLine();
            
            ClassEquipment classEquip = new ClassEquipment(i + 1, benchCount, fanCount, lightCount);
            classrooms[i] = new Classroom(i + 1, className, studentCount, classEquip);
        }
        
        // Create Labs
        System.out.print("\nHow many Labs? ");
        int labCount = scanner.nextInt();
        scanner.nextLine();
        Lab[] labs = new Lab[labCount];
        
        for (int i = 0; i < labCount; i++) {
            System.out.print("Enter Lab Name: ");
            String labName = scanner.nextLine();
            System.out.print("How many Lab Equipments? ");
            int equipCount = scanner.nextInt();
            scanner.nextLine();
            
            List<LabEquipment> labEquips = new ArrayList<>();
            for (int j = 0; j < equipCount; j++) {
                System.out.print("  Enter Equipment Name: ");
                String equipName = scanner.nextLine();
                System.out.print("  Enter Equipment Count: ");
                int count = scanner.nextInt();
                System.out.print("  Enter Equipment Cost: ");
                double cost = scanner.nextDouble();
                scanner.nextLine();
                labEquips.add(new LabEquipment(j + 1, equipName, count, cost));
            }
            
            labs[i] = new Lab(i + 1, labName, labEquips);
        }
        
        // Create Employees
        System.out.print("\nHow many Teachers? ");
        int teacherCount = scanner.nextInt();
        scanner.nextLine();
        List<Teacher> teachers = new ArrayList<>();
        
        for (int i = 0; i < teacherCount; i++) {
            System.out.print("Enter Teacher Name: ");
            String empName = scanner.nextLine();
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter Department ID: ");
            int deptId = scanner.nextInt();
            scanner.nextLine();
            teachers.add(new Teacher(i + 1, empName, salary, deptId));
        }
        
        System.out.print("How many Support Staff? ");
        int staffCount = scanner.nextInt();
        scanner.nextLine();
        List<SupportStaff> supportStaffs = new ArrayList<>();
        
        for (int i = 0; i < staffCount; i++) {
            System.out.print("Enter Staff Name: ");
            String empName = scanner.nextLine();
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter Department ID: ");
            int deptId = scanner.nextInt();
            scanner.nextLine();
            supportStaffs.add(new SupportStaff(i + 1, empName, salary, deptId));
        }
        
        // Create NoticeBoard
        NoticeBoard noticeBoard = new NoticeBoard("Admin");
        
        // Initialize School
        school.initialize(auditorium, playground, noticeBoard, teachers, supportStaffs, classrooms, labs);
        
        // Run School
        school.runSchool(scanner);
        
        scanner.close();
    }
}