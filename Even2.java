import java.util.*;

class Even2
{
    public static void main(String[] args) 
    {
        System.out.println("Input evarraaa doothaaaa\t");
        Scanner scan=new Scanner(System.in);
        int s1=scan.nextInt();

        for(int i=0;i<=s1;i++)
        {
            if(i%2==0)
            {
                System.out.println("Edigoraa dootha=\t"+i);
            }
        }
    }
}