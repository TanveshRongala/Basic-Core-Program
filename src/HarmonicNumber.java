import java.util.Scanner;

public class HarmonicNumber 
{
		public static void main(String[] args) {

			HarmonicNumber number = new HarmonicNumber();	//	class object
			number.start();
		}

		void start()
		{
			Scanner scanner = new Scanner(System.in);	
			System.out.print("Enter position in series: ");
			int n = scanner.nextInt();	
			if(n < 1)
			{	
				System.out.println("Number should be greater than 0");
				start();
			}
			else
			{
				System.out.println(n +"th harmonic number is: " +
							((double)1 / n));
			}
			scanner.close();
		}	
	}