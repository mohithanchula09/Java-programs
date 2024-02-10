import java.lang.*;

class Emp
{
    int a,b,c,z;

    void display(int a,int b)
    {
        int z=a+b;
        System.out.println("z="+z);


    }
    void display()
    {
        System.out.format("hello sathyabama");

    }
    void display(float x,float y)
    {
        float c=x+y;
        System.out.println("c="+c);

    }

}

class MethodOver
{
    public static void main(String[] args) 
    {
          Emp e1=new Emp();
         e1.display(100,200);
         e1.display(10000.00f,20000.00f);
         
        
    }
}