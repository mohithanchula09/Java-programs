import java.lang.*;

class Company
{

      static String company="HCL";
      int empno;
      String ename;

      void setDisplay()
	{
	  
	  System.out.println("empno="+empno);
	  System.out.println("ename="+ename);	
		
	}

}

class Eight
{
    public static void main(String args[])
	{ 
		Company e1=new Company();
		e1.empno=100;
		e1.ename="mohith";
		e1.setDisplay();
	
		Company e2=new Company();
		e2.empno=300;
		e2.ename="jeevan";
		e2.setDisplay();

		Company e3=new Company();
		e3.empno=500;
		e3.ename="sai";
		e3.setDisplay();
	}



}