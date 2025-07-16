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
		Scanner sc =new Scanner(System.in);
		int r=sc.nextInt();
		int h=sc.nextInt();
		double v=3.14*r*r*h;
		double p=v/1000.00;
		double pr=p*40;
		System.out.printf("%.2f\n",pr);
	}
}