package Day02;

public class Student {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("ajay");
        String name = student.getName();
        System.out.println("Name is " + name);
    }
}
