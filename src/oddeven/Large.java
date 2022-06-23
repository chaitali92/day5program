package oddeven;
import java.util.Scanner;
public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,num3;
System.out.println ("ENTER ANY THREE NUMBERS=");
Scanner in =new Scanner(System.in);
num1=in.nextInt();
num2=in.nextInt();
num3=in.nextInt();
if(num1>num2 && num1>num3) 
    System.out.println("The largest number is="+num1);
else if (num2>num1 && num2>num3)
	System.out.println("the largest number is="+num2);
else if (num3>num1 && num3>num2)
	System.out.println("the largest number is="+num3);
else
	System.out.println("the all numbers are same!!!!!!!!!");
	}

}
