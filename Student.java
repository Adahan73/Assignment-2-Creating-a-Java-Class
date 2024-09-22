public class Student {
    public String name;
    public int studentID;
    public String major;
    public double GPA;

    public Student(String name, int studentID, String major, double GPA) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
        this.GPA = GPA;
    }

    public Student() {
        this.name = "";
        this.studentID = 0;
        this.major = "";
        this.GPA = 0.0;
    }

    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
        System.out.println("----------------------------");
    }

    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            this.GPA = newGPA;
            System.out.println(name + "'s GPA has been updated to: " + GPA);
        } else {
            System.out.println("Invalid GPA value. GPA must be between 0.0 and 4.0.");
        }
    }

}
