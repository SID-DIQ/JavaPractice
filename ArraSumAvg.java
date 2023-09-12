import java.util.*;
// main class
public class ArraSumAvg 
{
    static int sum=0;
    // The method for calculate the sum..
    static void  Sum(int[] x)
    {
        for(int j=0; j<x.length;j++)
        {
            sum+=x[j];
        }
        System.out.println("The Sum Of Array is : " + sum);
    }
    // This class calculate the product of the array..
    static void Product(int[] pro)
    {
        int product=1;
        for(int i=0;i<pro.length;i++)
    {
        product*=pro[i];
    }
    System.out.println("The Product of Array : " + product);
    }
    //The class for calculate the avg..
    static void Average(int[] avg)
    {
     int ave=sum/avg.length;
     System.out.println("The Average of Array : " + ave);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array length : ");
        int length=sc.nextInt();
        int[] arr= new int[length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Sum(arr);
        Product(arr);
        Average(arr);
    }
}