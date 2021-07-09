import java.util.Scanner;
public class EvenOddNumber 
{
	public static void main(String args[])
	  {
		int num ;
	    Scanner Scan = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    num=Scan.nextInt();

	    if ( num % 2 == 0 )
	        System.out.println("The entered number is even");
	     else
	        System.out.println("The entered number is odd");
	  }
}