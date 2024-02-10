import java.lang.*;

class Ten

{

		static String input()throws Exception 
		{
		    
		    System.out.println("Give any character: \t");
		    String line="";
		    int uni_code= 0;


		    while( (uni_code=System.in.read()) !=13 )	

			{
				char s1=(char)uni_code;
				line=line+s1;
			}
			return line;
		}
      			public static void main(String args[])throws Exception
			{
		
				String ch=input();
				System.out.println("Given output is: \t"+ch);
		

			}
		}
