import java.util.*;
public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number Row :");
        int m=sc.nextInt();
        System.out.println("ENter The Number of Coulmns :");
        int n=sc.nextInt();
        sc.close();
        int arr[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=Integer.MIN_VALUE;  
        for(int i=0;i<m;i++){
             int sum=0;
            for(int j=0;j<n;j++){
            sum=arr[i][j]+sum;
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        System.out.println(max);
    }
}
