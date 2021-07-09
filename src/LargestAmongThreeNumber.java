import java.util.*;
public class LargestAmongThreeNumber 
{
	public static void main(String []s)
    {
        int a,b,c,largest;
        Scanner scan = new Scanner(System.in);
         
        System.out.print("Enter first  number:");
        a=scan.nextInt();
        System.out.print("Enter second number:");
        b=scan.nextInt();
        System.out.print("Enter third  number:");
        c=scan.nextInt();
         
        if ( a>b && a>c )
            largest=a;
        else if ( b>a && b>c )
            largest=b;
        else
            largest=c;
         
        System.out.println("Largest Number is : "+largest);
         
    }
}