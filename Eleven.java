import java.lang.*;

class Company
{

      void display()
	{
	   System.out.println("Instance method");
	}

      static void set()
	{
	   System.out.println("Static method");
	}
}

class Eleven
{

     public static void main(String args[])
	{

           Company.set();
	   Company c1=new Company();
	   c1.display();
	   c1.set(); // internal ga class name will invoke #Company.set();
	}
}