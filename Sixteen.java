import java.lang.*;
class Student 
{
    int sno;
    String sname;
    
    
    void display(int sid, String stname )
    {
        sno=sid;
        sname=stname;
        System.out.println("sno="+sno);
        System.out.println("sname="+sname);

    }
    void set()
    {

    }
Student()
{
    
}

}

class Sixteen
{
    public static void main(String[] args) throws Exception {
        Student s1=new Student();
        s1.display(101,"mohith");
        System.out.println("Give student id");
        int r1=System.in.read();
       
       
        
    }
}