import java.util.*;
public class Swaping {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Value : ");
        int num1=sc.nextInt();
        System.out.println("Enter The second Value : ");
        int num2=sc.nextInt();
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("The swapped Vaue is num1 = " + num1 + " \nThe swapped Vaue is num2 = " + num2);
    }
}
