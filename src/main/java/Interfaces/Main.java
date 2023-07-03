package Interfaces;

import Interfaces.Q1.Interface1;
import Interfaces.Q1.Interface2;
import Interfaces.Q2.Child;
import Interfaces.Q2.Parent;
import Interfaces.Q3.ImplementStatic;
import Interfaces.Q4.ImplementFinal;

public class Main implements Interface1, Interface2 {

    @Override
    public void callInterface1() {
        System.out.println("Called Abstract Method of Interface1");
    }

    @Override
    public void callInterface2() {
        System.out.println("Called Abstract Method of Interface2");
    }

    public static void main(String[] args){

        Main main=new Main();

        //Q1
        main.callInterface1();
        main.callInterface2();

        //Q2
        Parent parent=new Parent(30);
        System.out.println("Parent : "+ parent.getParentAge());

        Child child1=new Child(30,10);
        System.out.println("Parent : "+ child1.getParentAge());
        System.out.println("Child : "+ child1.getChildAge());

        Child child2=new Child(10);
        System.out.println("Parent : "+ child2.getParentAge());
        System.out.println("Child : "+ child2.getChildAge());


        //Q3
        System.out.println("Static Variable Value :  "+ ImplementStatic.getAge());

        //Q4
        ImplementFinal impl =new ImplementFinal();
        impl.getFinal();


    }
}
