class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }
}

class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College: " + college.getCollegeName() + ", Location: " + college.getCollegeLoc());
    }
}

public class collegeMain {
    public static void main(String[] args) {
        College college1 = new College("ABC College", "City A");
        College college2 = new College("XYZ College", "City B");

        Student student1 = new Student(101, "John Doe", college1);
        Student student2 = new Student(102, "Jane Smith", college2);

        System.out.println("College Information:");
        System.out.println("College 1: " + college1.getCollegeName() + ", Location: " + college1.getCollegeLoc());
        System.out.println("College 2: " + college2.getCollegeName() + ", Location: " + college2.getCollegeLoc());

        System.out.println("\nStudent Information:");
        System.out.println("Student 1:");
        student1.displayStudentInfo();
        System.out.println("\nStudent 2:");
        student2.displayStudentInfo();
    }
}
