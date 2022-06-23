package oddeven;

import java.util.Scanner;

public class swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE FIRST NYMBER=");
a=sc.nextInt();
System.out.println("ENTER THE SECOND NYMBER=");
b=sc.nextInt();
System.out.println("BEFORE WE SWAPPING=");
System.out.println("a="+a+",b="+b);
c=a;
a=b;
b=c;
System.out.println("AFTER SWAPPING=");

System.out.println("a="+a+",b="+b);
	}
}
