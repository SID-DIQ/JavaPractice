import java.util.Scanner;
public class Prime1 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter The Number : ");
     int num =sc.nextInt();
     sc.close();
     int count=0;
     for(int i=2;i<=num;i++)
     {
        if(num%i==0){
            count++;
        }
     }   
     if(count==1){
        System.out.println(num + " is the prime number");
     }
     else{
        System.out.println(num + " It is Not A Prime NUmber");
     }
    }
}
