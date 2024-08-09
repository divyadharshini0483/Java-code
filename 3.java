import java.util.Scanner;
public class Student {
    private String name;
    private String regNo;
    private String dept;
    private int year;
    private int semester;
    private int mark1, mark2, mark3, mark4, mark5, mark6;
    private int total;
    private double average;
    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        regNo = sc.nextLine();
        dept = sc.nextLine();
        year = sc.nextInt();
        semester = sc.nextInt();
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();
        mark4 = sc.nextInt();
        mark5 = sc.nextInt();
        mark6 = sc.nextInt();
        total = mark1 + mark2 + mark3 + mark4 + mark5 + mark6;
        average = total / 6.0;
    }
    public void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Department: " + dept);
        System.out.println("Year: " + year);
        System.out.println("Semester: " + semester);
        System.out.println("\nMarks:");
        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);
        System.out.println("Subject 4: " + mark4);
        System.out.println("Subject 5: " + mark5);
        System.out.println("Subject 6: " + mark6);
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average + "%");
    }
}
public class StudentMarks {
    public static void main(String[] args) {
        Student student = new Student();
        student.getDetails();
        student.display();
    }
}
