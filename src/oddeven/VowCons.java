package oddeven;
import java.util.Scanner;
public class VowCons {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("ENTER ANY CHARACTER=");
Scanner sc= new Scanner(System.in);
char ch=sc.next().charAt(0);
if (ch=='a' ||ch=='e' ||ch=='i'||ch=='o' ||ch=='u') {
	System.out.println("GIVEN CHAR IS VOWEL");
	}
else {
	System.out.println("GIVEN CHAR IS CONSONANT");
}
	}

}
