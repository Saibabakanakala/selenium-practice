package automation.selenium;
   class Demo1
   {
	   void m1()
	   {
		   System.out.println("automation testing");
	   }
   
   void m2()
   {
	   System.out.println("selenium testing");
   }
   }
  class Demo2 extends Demo1
  {
	 void m3()
	 {
		 System.out.println("manual testing");
	 }
  
  }
   
   
public class Demo {
	
	 public static void main(String[] args) 
	 {
 
	 Demo2  y=new Demo2();
	 
	 y.m1();
	 y.m2();
	 y.m3();
			 }
	

		
  }
   
  

