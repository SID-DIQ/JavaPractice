import java.util.*;
public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of your choice: ");
       int n = sc.nextInt();
        int temp1,i,rem,c,sum=0;
       temp1=n;
       while(n!=0)
       {
        rem=n%10;
        c=1;
        for(i=rem;i>0;i--){
          c*=i;
        }
        sum+=c;
        n/=10;
       }
       if(temp1==sum)
          System.out.println("This is a Strong Number");
        else
          System.out.println("This is not a Strong Number");
        
    }
}
