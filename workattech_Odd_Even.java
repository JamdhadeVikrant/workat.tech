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
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for (int i = 0; i < a; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
        }
	}
}