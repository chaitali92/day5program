package oddeven;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE FIRST NYMBER=");
a=sc.nextInt();
System.out.println("ENTER THE SECOND NYMBER=");
b=sc.nextInt();
System.out.println("BEFORE WE SWAPPING=");
System.out.println("a="+a+",b="+b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("AFTER SWAPPING=");

System.out.println("a="+a+",b="+b);
	}
}
