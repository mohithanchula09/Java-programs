import java.util.*;

class Dog
{
    static int a;
    int x,y;

    void display(int x,int y)
    {
        this.x=x;
        this.y=y;
        System.out.println("x in present object=  "+x);
        System.out.println("y in present object=  "+y);

    }
}


class Read
{
    public static void main(String[] args) 
    {
        Dog d1=new Dog();
        d1.display(100, 200);

        
    }
}