import java.util.Scanner;
public class RevanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array length");
        int length = sc.nextInt();
        sc.close();
        System.out.println("Enter The Numbers");
        String [] a = new String[length];
        for(int i=0;i<length;i++)
        {
            a[i] = sc.nextLine(); 
            a[i]=sc.next();
        }
        for(int i=length-1;i>=0;i--)
        {
        System.out.println("The Reversed numbers is " + a[i]);
        }
        }
}

