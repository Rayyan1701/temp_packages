package cpack;
import apack.A;

public class C {
   public C()
    {

    }
    public void display()
    {
        A obj= new A();
        obj.b=10;
        System.out.println("Inside Class C :-");
        System.out.println("Only public variables are visible from inherited class A");
        
        System.out.println("numbers are:-"+obj.b);

    }
}
