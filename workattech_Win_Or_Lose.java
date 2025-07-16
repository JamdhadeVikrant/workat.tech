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
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }

        if (max % 2 == 0) {
            System.out.println("WON");
        } else {
            System.out.println("LOST");
        }
	}
}