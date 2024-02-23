class Bird
{
    String name,color,food;
   
    Bird(String name,String color,String food)
    {
        this.name=name;
        this.color=color;
        this.food=food;

    }
    void fly()
    {
        
        System.out.println(name+"   can't fly");
    }
    void eats()
    {
        System.out.println(name+"   eats    "+food);
    }
    void sing()
    {
       
        System.out.println(name+"   sings a song");
    }
    void dance()
    {
        System.out.println(name+"   dances");
    }
}

class Parrot extends Bird
{
    Parrot(String name,String color,String food)
    {
        super(name, color, food); // base class constructor calling method
    }

}
class Ostrich extends Bird
{
    Ostrich(String name,String color,String food)
    {
        super(name, color, food); // base class constructor calling method

    }
}
class Methodoveriding
{
    public static void main(String[] args) 
    {
        Parrot p1=new Parrot("parrot","green","seeds");
        p1.eats();
        p1.sing();
        p1.dance();
        Ostrich o1=new Ostrich("ostrich","brown","insects");
        o1.fly();
        o1.eats();
        
    }
}