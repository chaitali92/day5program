package power;
public class PowersOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=31 ;
        int i = 0;     
        
        int powerOfTwo = 1;       

        // repeat until i equals n
        while (i <= 31) {
            System.out.println(i + " " + powerOfTwo);   
            powerOfTwo = 2 * powerOfTwo;                
            i = i + 1;
        }

    }
}
