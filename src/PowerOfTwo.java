	import java.util.Scanner;
	public class PowerOfTwo
	{
	
		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);
		    System.out.println("Enter N: ");
		    int power = scan.nextInt();
	
		    	System.out.println("Power of 2: ");
		        for(int i=0; i<=power ; i++)
		        {
			    	int result=((int)Math.pow(2,i));
			        if( result <= 0 || result <=31)
			        {
			        	System.out.println("Result is: "+ result);
			        }
			        else
			        {
			        	System.out.println("Value overflows int value, try again!");
			        }
		        }
		}
	
	}