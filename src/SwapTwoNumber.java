import java.util.Scanner;
public class SwapTwoNumber 
{
	 public static void main(String[] args) 
	 {
	  int a, b, c;
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter Value in a :");
	  a=scan.nextInt();
	  System.out.println("Enter Value in b :");
	  b=scan.nextInt();
	  c=a;
	  a=b;
	  b=c;
	  System.out.println("Values in a:" +a);
	  System.out.println("Values in b:" +b);
	 }
}