import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter The Number");
        int num=sc.nextInt();
       sc.close(); 
       //int a=4;
        int i;
        int b=1;
        for(i=num;i>=1;i--){
            b=b*i;       
        }
        System.out.println(b);
    }
}
