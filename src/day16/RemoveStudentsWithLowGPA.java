package day16;

import java.util.ArrayList;
import java.util.List;

public class RemoveStudentsWithLowGPA {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ajay", "Kommera", 4.00));
        students.add(new Student("Tejaswini", "Jalli", 3.5));
        students.add(new Student("Ravi", "Kannegundla", 3.00));
        students.add(new Student("Siri Chandana", "Pinireddy", 2.75));

        double averageStudentsGPA = getAverageStudentsGPA(students);

        removeStudentsWithLowGPA(students, averageStudentsGPA);

        printNewStudentsBasedOnAvgGPA(students);


    }

    private static void printNewStudentsBasedOnAvgGPA(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getGPA());
        }
    }

    private static void removeStudentsWithLowGPA(List<Student> students, double averageStudentsGPA) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGPA() < averageStudentsGPA) {
                students.remove(i);
                i--;
            }
        }
    }

    private static double getAverageStudentsGPA(List<Student> students) {
        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.getGPA();
        }
        return totalGPA / students.size();
    }

}

class Student {

    private String firstName;
    private String lastName;
    private double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public double getGPA() {
        return GPA;
    }


}

