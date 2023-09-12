/*program for printing pattern models */
import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter The Number of Rows");
        int row=sc.nextInt();
        sc.close();
        int i,j;
        for(i=1;i<=row;i++){
            if(i==1 || i==5){
                for(j=1;j<=row;j++){
                System.out.print("*");
            }
            }
            System.out.print("\n");
        }
    }
}
