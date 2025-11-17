
package schoolmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. إنشاء المدرسة (بيانات أساسية)
        System.out.println("Create School (first time only)");

        System.out.print("Enter School Name: ");
        String schoolName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Contact Number: ");
        String contactNumber = scanner.nextLine();

        System.out.print("Enter Medium of Study: ");
        String mediumOfStudy = scanner.nextLine();

        SchoolManagement school = new SchoolManagement(schoolName, address, contactNumber, mediumOfStudy, true);

        // 2. إنشاء القاعة (Auditorium)
        System.out.print("Enter number of seats in Auditorium: ");
        int seats = scanner.nextInt();
        scanner.nextLine(); // استهلاك newline بعد nextInt

        Auditorium auditorium = new Auditorium(seats);

        // 3. إنشاء ملعب (Playground) افتراضي هنا
        Playground playground = new Playground(1000.0, 0);

        // 4. إنشاء قائمة الفصول الدراسية (Classroom) — سنفترض طريقة بسيطة
        List<Classroom> classrooms = new ArrayList<>();
        System.out.print("How many classrooms? ");
        int classCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < classCount; i++) {
            System.out.printf("Classroom %d - Enter student count: ", i + 1);
            int studentCount = scanner.nextInt();
            scanner.nextLine();
            System.out.printf("Classroom %d - Enter className: ", i + 1);
            String className = scanner.nextLine();

            System.out.print("Enter Class Equipment benchCount: ");
            int benchCount = scanner.nextInt();
            System.out.print("Enter fanCount: ");
            int fanCount = scanner.nextInt();
            System.out.print("Enter lightCount: ");
            int lightCount = scanner.nextInt();
            scanner.nextLine();

            ClassEquipment classEquip = new ClassEquipment(0, 0, i + 1, benchCount, fanCount, lightCount);
            Classroom classroom = new Classroom(i + 1 ,className,  0, studentCount,  0);
            classrooms.add(classroom);
        }

        // 5. إنشاء قائمة المختبرات (Lab)
        List<Lab> labs = new ArrayList<>();
        System.out.print("How many labs? ");
        int labCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < labCount; i++) {
            System.out.printf("Lab %d - Enter labName: ", i + 1);
            String labName = scanner.nextLine();

            System.out.print("Enter inchargeId: ");
            int inchargeId = scanner.nextInt();
            System.out.print("Is occupied (true/false): ");
            boolean occupied = scanner.nextBoolean();
            scanner.nextLine();

            Lab lab = new Lab(i + 1, inchargeId, labName, occupied);
            labs.add(lab);
        }

        // 6. الموظفين (Teachers و SupportStaff) — مثال مختصر
        List<Employee> employees = new ArrayList<>();
        System.out.print("How many teachers? ");
        int teachersCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < teachersCount; i++) {
            System.out.printf("Teacher %d - Name: ", i + 1);
            String name = scanner.nextLine();
            System.out.printf("Teacher %d - Salary: ", i + 1);
            double salary = scanner.nextDouble();
            System.out.printf("Teacher %d - Department ID: ", i + 1);
            int departmentId = scanner.nextInt();
            scanner.nextLine();

            // مثال: هنا يفترض أن لديك كلاس Teacher يرث من Employee
            employees.add(new Teacher(i + 1, name, salary, departmentId, "Subject"));
        }

        System.out.print("How many support staff? ");
        int supportCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < supportCount; i++) {
            System.out.printf("Support Staff %d - Name: ", i + 1);
            String name = scanner.nextLine();
            System.out.printf("Support Staff %d - Salary: ", i + 1);
            double salary = scanner.nextDouble();
            System.out.printf("Support Staff %d - Department ID: ", i + 1);
            int departmentId = scanner.nextInt();
            scanner.nextLine();

            // مثال: SupportStaff يرث من Employee
            employees.add(new SupportStaff(i + 1 + teachersCount, name, salary, departmentId, "Role"));
        }

        // 7. NoticeBoard (بادئ ذي بدء بمحتوى فارغ)
        NoticeBoard noticeBoard = new NoticeBoard(new ArrayList<>(), "Admin");

        // تهيئة المدرسة بالمكونات
        school.initialize(auditorium, playground, noticeBoard, employees, classrooms, labs);

        System.out.println("\nSchool created successfully!");
        school.schoolDetails();

        // يمكنك بعدها تشغيل الواجهة التفاعلية
        school.runSchool();

        scanner.close();
    }
}