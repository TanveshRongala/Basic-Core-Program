import java.util.Scanner;
public class Flipacoin {


    public static void main(String[] args)
    {
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("enter number of time you want to flip a coin : ");
	    int numofflips = scanner.nextInt();
	    scanner.close();
	    if (numofflips <=0)
	    {
	  	  System.err.println("Please enter a postive integer");
	    }
	    else
	    {
	  	  int numofheads = 0;
	  	for (int i= 0; i < numofflips; i++)
		  {
	  	//generating a random number 0 and 1
			  if (Math.random() >0.5)
			  {
				  numofheads++;
			  }
		  }
	double percentofHeads = (numofheads*100)/numofflips;
	double percentofTails = 100-percentofHeads;
	System.out.println("heads perecentage : "+ percentofHeads);
	System.out.println("Tails perecentage : "+ percentofTails);

	}
	}

}
