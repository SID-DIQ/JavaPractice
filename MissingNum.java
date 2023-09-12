import java.util.*;
public class MissingNum 
{
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array values : ");
        int sum=0;
        int sumArray=0;
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
            sumArray=sumArray+arr[i];
        }
        for(int k=1;k<=arr.length;k++)
        {
            sum=sum+k;
        }   
        System.out.println("The Missing number is : " + (sum-sumArray));
    }
}
