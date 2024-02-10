import java.lang.*;

class College
{

    void display()
	{
	   System.out.println("Hello Students");
	}
}

class Student
{

        static College c1=new College();     

}

class Thirteen
{
   public static void main(String args[])
    {
        Student.c1.display();   
    }

}

