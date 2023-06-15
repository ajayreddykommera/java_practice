package Day08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return this.lastName.compareTo(other.lastName);
    }
}

public class SortByCSVFile {
    public static void main(String[] args) {
//        String csvFile = "./Day08/Assets/students.csv";
        File csvFile = new File("/Users/ajayreddykommera/Downloads/Java_Practice/src/Day08/Assets/students.csv");
        String line;
        String cvsSplitBy = ",";

        Student[] students = new Student[10];

        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine(); // Skip the header line

            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                String firstName = data[0];
                String lastName = data[1];
                double gpa = Double.parseDouble(data[2]);
                Student student = new Student(firstName, lastName, gpa);
                students[count] = student;
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort the students using a simple bubble sort algorithm
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {

                if (students[j].compareTo(students[j + 1]) > 0) {

                    // Swap students
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Print sorted student data
        for (int i = 0; i < count; i++) {
            Student student = students[i];
            System.out.println(student.getLastName() + ", " + student.getFirstName() + ", " + student.getGpa());
        }
    }
}