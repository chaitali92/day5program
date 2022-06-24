package HARM;
import java.util.Random;
public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = 0, num = 0, j;
		int n;
		Random r = new Random();
    	System.out.print("enter the harmonic you want to find: ");
		n = r.nextInt();
		
     	for (j = 1; j <= n; j++) {
			num = num + (1 / j);
			result = num;
		}
		System.out.println("the value of harmonic no. " + n + " is: " + result);

	}

}
