package dpack;

import bpack.B;
import cpack.C;
public class protectedDemo {

  public static void main(String[] args) 
  {
      B objb= new B(2,3);
      C objc= new C();

      objb.display();
      objc.display();


    
    }
    
}
