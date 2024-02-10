import java.lang.*; // import statement

class Employee
{

           static int s; // static variable
	   int a,b; // instance variable 

}

class Five
{

          public static void main(String args[])
		{

	           Employee e1=new Employee();    // object creation
		   e1.a=100;
		   e1.b=200;
		   System.out.println("object state 1...............");
		   System.out.println(e1.a);
		   System.out.println(e1.b);
		   
                   Employee e2=new Employee();  // object creation 
	           e2.a=300;
		   e2.b=400;
		   System.out.println("object state 2...............");
		   System.out.println(e2.a);
		   System.out.println(e2.b);
		   Employee e3=new Employee();  // object creation
		   e3.a=500;
		   e3.b=600;
		   System.out.println("object state 3...............");
		   System.out.println(e3.a);
		   System.out.println(e3.b);
		}
}