import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		double p= sc.nextDouble();
		double r=sc.nextDouble();
		double t=sc.nextDouble();
		double result =(p*r*t)/100;
		System.out.printf("%.6f\n",result);
		
	}
}