import java.util.*;
public class Find {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter The Limit :");
    int length=sc.nextInt();
    System.out.println("Enter The Array element");
    int []arr=new int[length];
    for(int i=0;i<length;i++){
        arr[i]=sc.nextInt();
    }
    sc.close();
    for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            if(arr[i]<arr[j]) 
            {
                int tem=arr[i]; 
                arr[i]=arr[j];  
                arr[j]=tem;     
            }
        }
            //for(int i=0;i<length;i++)
            //{
                //System.out.println(arr[i]+ " " +" ");
            //}
        System.out.println("second Min val :" + arr[length-2]);
        System.out.println("second Max val :" + arr[1]);
    }
}
