package HARM;
import java.util.Scanner;

public class Harmonic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,j;
double harmonicnumber=1;
System.out.println("ENTER THE NUMBER");
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for ( j=1 ; j<n;j++)
{
	harmonicnumber=(double)(harmonicnumber+(double)1 / (j+1));
}
System.out.println("harmonic value of"+n+"is"+harmonicnumber);
	}

}
