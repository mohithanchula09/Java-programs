class One
{
    int a,b,c;
    
    One()
    {
        
        System.out.println("Default parametr");
    }
    One(int a ,int b)
    {
        this();
        System.out.println("parameterised constructor");
        this.a=a;
        this.b=b;
       
    }
    void display()
    {
        System.out.println("instance method");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

}

class ThisDemo
{
    public static void main(String[] args) {
        One d1=new One(100,200);
        d1.display();
    }
}