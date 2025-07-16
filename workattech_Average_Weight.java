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
		Scanner sc = new Scanner(System.in);
        
        double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            sum += sc.nextDouble();
        }

        double average = sum / 10.0;
        System.out.printf("%.6f\n", average);
	}
}