import java.util.Scanner;

/**
   Computes the computes the sum of the integers from 1 to n.
*/
public class Sum
{  
   public static void main(String[] args)
   {  
		Scanner num = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("This program can tell you the sum of all integers between 0 and a number you select. Please give a number:");
	    int n = num.nextInt();
	    int sum = 0;
	    for (int i = 1; i <= n; i++) {
	    	sum = sum + i;
	    }
	    System.out.println(sum);
	    num.close();
   }
}
