import java.util.*;
public class Decimal {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
	    int octal=0;
        int i=1;
        int remainder;
		System.out.println("Enter a Decimal Number");
		int decimal = sc.nextInt();
		while(decimal>0){
		    remainder = decimal%8;
		    octal +=  i*remainder;
		    decimal = decimal/8;    
            i=i*10;                 
		}
		System.out.println("Octal: "+octal);
    }
}
