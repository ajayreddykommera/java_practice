package Day04_05.Q3;

public class ImplementStatic {

    private static int age;

    static{
        age = getStaticAge();
    }

    private static int getStaticAge() {
        return 24;
    }

    public static int getAge() {
        return age;
    }
}
