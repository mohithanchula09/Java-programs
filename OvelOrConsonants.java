import java.util.*;

class OvelOrConsonants
{
    public static void main(String[] args)
     {
        String name;
        System.out.println("give a character");
        Scanner scan=new Scanner(System.in);
        String s1=scan.next();
        char s2=s1.charAt(0);
        switch (s2) 
        {
          case 'a': 
          case 'e': 
          case 'i': 
          case 'o': 
          case 'u': 
                System.out.println("given character is vowel");
                break;
          default :
                 System.out.println("given character is not vowel");
        }


            

     }
}