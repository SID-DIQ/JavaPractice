import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num1=s.nextInt();
        s.close();
        int count=0;
        int  num2=num1;
        int res=0;
        while(num2!=0)
        {
            count = count+1; 
            num2=num2/10; 
        }
        num2=num1;
        for(int i=0; i<count; i++)
        {
            int lastdigit=num1%10;
            int temp=1;
            for(int j=0; j<count; j++)
            {
                temp=temp*lastdigit;
            }
           res=res+temp;
            num1=num1/10;
        }
        if(res==num2)
            System.out.println(" The Given Number is Armstrong Number");
          else
          System.out.println("The Given Number Is Not Armstrong ");
    }
}