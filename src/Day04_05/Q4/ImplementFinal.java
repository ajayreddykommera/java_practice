package Day04_05.Q4;

 public final class ImplementFinal {
    private final int age;

    public ImplementFinal() {
        age = 0;
    }
    //final method
    public final void getFinal(){
        System.out.println("Final Method Called");
    }

    public int getAge() {
        return age;
    }
}
