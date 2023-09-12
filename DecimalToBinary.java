import java.util.*;
public class DecimalToBinary {
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
	    int binary=0;
        int i=1;
        int remainder;
		System.out.println("Enter a Decimal Number");
		int decimal = sc.nextInt();
        sc.close();
		while(decimal>0){
		    remainder = decimal%2;
		    binary +=  i*remainder;
		    decimal = decimal/2;    
            i=i*10;                 
		}
		System.out.println("Binary: "+binary);
    }
}