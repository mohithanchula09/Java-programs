class Hello
{    
    void display()
    {
        System.out.println("hello chennai");
    }

    Hello(int a , int b )
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}

class Fun extends Hello
{  
    void get()
    {
        System.out.println("hello sathybama");
    }

    Fun(int x,int y)
    {   super(20,30);
        System.out.println("child class constructor calling");
        System.out.println("x="+x);
        System.out.println("y"+y);
    }
}

class Super 
{    
    public static void main(String[] args)
    {
        Fun f1=new Fun(50,60);
        f1.display();
        f1.get();
        
    }

    
}