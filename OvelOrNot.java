import java.util.*;
public class OvelOrNot
 {
        public static void main(String[] args) 
        {
           String name;
           System.out.println("give a character:");
           Scanner scan=new Scanner(System.in);
           String s1=scan.next();
           char s2=s1.charAt(0);

           if (s2=='a' || s2=='e' || s2=='i' || s2=='o' || s2=='u') 
           {
                System.out.println("given character is vowel");
            
           }
           else{
             System.out.println("given character is not vowel");
           }

        }
     
 }