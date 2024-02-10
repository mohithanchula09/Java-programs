class Two
{
    int a,b;
    Two()
    {
        System.out.println("Default contructor");

    }

    Two(int a,int b)
    {   
        this();
        System.out.println("parameterized constructor");
        a=a;
        b=b;

    }

    void display()
    {
        System.out.println("instance method");
        System.out.println("a="+a);
        System.out.println("b="+b);
        ;
    }

}
class ThisDemo2
{
    public static void main(String[] args) {
        Two t1=new Two(100, 200);
        t1.display();
        
    }
}