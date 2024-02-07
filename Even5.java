import java.lang.*;
import java.util.Scanner;

class Even5
{
    public static void main(String[] args) 
    {
        System.out.print("number enter cheyi=\t");
        
        Scanner scan=new Scanner(System.in);
        int s1=scan.nextInt();
        //i=0

        for(int i=0;i<=s1;i++)
        {
            if (i%2==0) 
            {
                System.out.println(i);
            }
        }
        

    }
}