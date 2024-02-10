import java.util.*;

class Even
{
    public static void main(String[] args) 
    {
        System.out.print("Give a integer value\t");
        Scanner scan=new Scanner(System.in);
        int s1=scan.nextInt();
        
        for(int i=0;i<=s1;i++)
        {
            System.out.println("given total numbers=\t"+i);
        }
    }
}