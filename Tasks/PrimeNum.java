import java.util.Scanner;
public class PrimeNum{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int range =sc.nextInt();
        int count;
        int f=1;
        System.out.println("The NUmber is Not a PRime or Prme " + f);
        for(int i=2;i<=range;i++)
        {
            count=0;
            for(int j=2;j<=range;j++)
            {
                if(i%j==0)
                count++;
            }
            if(count==1)
            System.out.println("The Prime Num is :" + i);
            else
            System.out.println(i+ " it is  not a prime num");
    }
}
}
