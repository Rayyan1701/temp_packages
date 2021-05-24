package bpack;
import apack.A;

public class B extends A
{
   public B(int b,int c)
    {
        super.b=b;
        super.c=c;

    }
      
    public void display()
    {
        System.out.println("Inside Class B :-");
        System.out.println("Only public and protected variables are visible from inherited class A");
        System.out.println("numbers are:-"+super.b+" "+super.c+"\n\n");

    }
}
