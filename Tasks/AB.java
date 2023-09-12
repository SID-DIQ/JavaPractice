import java.util.*;
public class AB {
    public static void main(String[] args) {
        String n1= "Alice";
        String n2= "Bob";
        System.out.print("Enter The Number of Rolls :");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        //int len=sc.nextInt();
        int max;
        int a[] = new int[6];
        for(int i=0;i<a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(int i=0;i<a.length-3;i++){
        if(a[0]<a[i])
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;         
        }
        for(int i=0;i<a.length-x;i++)
        {
            System.out.print(a[i]+ " " +" ");//1tym
        }
        }
        System.out.println()
    }
}
