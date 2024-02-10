import java.lang.*;

class Emp
{
    int a;
    float b;

    void display()
    {
        System.out.println("hello");
    }
Emp(int a,float b)
{
    this.a=a;
    this.b=b;
    System.out.println("a="+a);
    System.out.println("b="+b);
}

}

class Fifteen
{
    public static void main(String[] args) {
       Emp e1=new Emp(101,100000.00f);
       e1.display();
    }
}
