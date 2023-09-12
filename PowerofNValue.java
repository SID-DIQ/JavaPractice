import java.util.Scanner;
public class PowerofNValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value");
        int a=sc.nextInt();
       // sc.close();
        System.out.println("Enter The Exponenet Value");
        int b=sc.nextInt();
        sc.close();
        int result=1;
        for(int i=1; i<=b; i++){
            result=result*a;
        }
        System.out.println(result);
     } 
}
