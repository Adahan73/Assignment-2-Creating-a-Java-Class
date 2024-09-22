public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();

        Student student2 = new Student("Adakhan", 230141031, "Cybersecurity", 4);
        Student student3 = new Student("Chyngyz", 230141052, "Computer science", 3.7);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }

}
