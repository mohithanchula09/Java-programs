import java.util.*;

class Odd
{
    public static void main(String[] args) 
    {
        System.out.print("Integer enter cheyira chariii=\t");
        Scanner scan=new Scanner(System.in);
        int s1=scan.nextInt();

        if(s1%2!=0)
        {
            System.out.println("Odd ehh charii");
        }
        else
        {
            System.out.println("Odd kadhura sunta");
        }
    }
}