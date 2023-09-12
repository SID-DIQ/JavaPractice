import java.util.*;
public class Index {
    static int num=sc.nextInt();
    static void Index(int[] x)
    {
        System.out.println("Enter The Value : ");
        int c=0;
        for(int i=0;i<5;i++){
                if(x[i]==num){
                System.out.println(i);
        }
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array length :");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Index(arr);
    }
}