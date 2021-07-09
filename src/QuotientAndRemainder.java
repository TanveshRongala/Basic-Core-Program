import java.util.*;
public class QuotientAndRemainder 
{

	public static void main(String[] args) 
	{
		int num1;
		Scanner scan=new Scanner(System.in);
        System.out.print("Enter first  number:");
        num1=scan.nextInt();
		int  num2 = 2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
	}

}