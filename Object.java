class Emp
{
    

    void display( int empno,String empname,float empsalary)
    {   System.out.println("object state");
        System.out.println("empno=\t"+empno);
        System.out.println("empname=\t"+empname);
        System.out.println("empsalary=\t"+empsalary);
    }

}

class ArrayOfObjects
{
    public static void main(String[] args) 
    {
        Emp e1=new Emp();
        Emp e2=new Emp();
        Emp e3=new Emp();
        e1.display(1,"mohith",100000.00f);
        e2.display(2,"shanmukh",200000.00f);
        e3.display(3,"jeevan",3000000.00f);
    
        

        
    }
}