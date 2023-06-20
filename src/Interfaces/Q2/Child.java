package Interfaces.Q2;

public class Child extends Parent {
    private int childAge;

    public Child(int parentAge,int childAge) {
        super(parentAge);
        this.childAge = childAge;
    }

    public Child(int childAge) {
        super(10);
        this.childAge = childAge;
    }

    public int getChildAge() {
        return childAge;
    }
}
