package Collection_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student {
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
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class HashMapImpl {

    public static void main(String[] args) {
        HashMap<String, Student> studentMap = new HashMap<>();

        Student student1 = new Student("Ajay", "Kommera", 3.7);
        Student student2 = new Student("Vijay", "Kommera", 3.9);
        Student student3 = new Student("tejaswini", "Jalli", 3.5);
        Student student4 = new Student("Siri", "Pinireddy", 3.5);
        Student student5 = new Student("Sujith", "jonnadula", 3.5);
        Student student6 = new Student("Supraja", "Sureddy", 3.5);
        Student student7 = new Student("reshmitha", "Damrachrla", 3.5);
        Student student8 = new Student("Vamshi", "Bodhankar", 3.5);

        studentMap.put(student1.getFirstName(), student1);
        studentMap.put(student2.getFirstName(), student2);
        studentMap.put(student3.getFirstName(), student3);
        studentMap.put(student4.getFirstName(), student4);
        studentMap.put(student5.getFirstName(), student5);
        studentMap.put(student6.getFirstName(), student6);
        studentMap.put(student7.getFirstName(), student7);
        studentMap.put(student8.getFirstName(), student8);


        System.out.println("--------Print the HashMap using Entry set------");
        // Print the HashMap using Entry set
        Set<Map.Entry<String, Student>> entrySet = studentMap.entrySet();
        for (Map.Entry<String, Student> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("-------Print the HashMap using map's forEach method-------");
        // Print the HashMap using map's forEach method
        studentMap.forEach((key, value) -> System.out.println(key + ": " + value));


        System.out.println("-------Print the HashMap using keySet and Iterator--------");
        // Print the HashMap using keySet and Iterator
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Student student = studentMap.get(key);
            System.out.println(key + ": " + student);
        }
    }
}
