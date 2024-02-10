import java.lang.*;

class Emp
{

	static int s; // static variable
	int a,b; // instance variables
}

class Seven
{
          public static void main(String args[])
		{
			Emp e1=new Emp();
			e1.a=100;
			e1.b=200;
	                System.out.println("int literal declaration.");
			System.out.println(e1.a);
			System.out.println(e1.b);
	
			Emp e2=new Emp();
			e2.a=300;
			e2.b=400;
			System.out.println("int literal declaration.");
			System.out.println(e2.a);
			System.out.println(e2.b);

			Emp e3=new Emp();
			e3.a=500;
			e3.b=600;
			System.out.println("int literal declaration.");
			System.out.println(e3.a);
			System.out.println(e3.b);
			
		
		}
}