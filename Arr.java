import java.lang.*;

class Arr 
{
    public static void main(String[] args) 
    {
        Emp e1=new Emp(1,"mohith",5000000.00f);
        Emp e2=new Emp(2,"shanmukh",4000000.00f);
        Emp e3=new Emp(3,"jeevan",3000000.00f);
        Emp[] arr=new Emp[];
        arr[0]=e1;
        arr[1]=e2;
        arr[2]=e3;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);



    }

    
}