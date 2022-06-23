package oddeven;
import java.util.Scanner;
public class Quorem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("ENTER THE VALUE TO no1");
int no1=scan.nextInt();
System.out.println("ENTER THE VALUE TO no2");
int no2=scan.nextInt();
int quotient=no1/no2;
int remainder=no1%no2;
System.out.println("QUOTIENT IS="+quotient);
System.out.println("REMAINDER IS="+remainder);




	}

}
