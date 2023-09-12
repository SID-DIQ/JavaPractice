import java.util.Scanner;
public class SumOfSingle {
    public static void main(String[] args) {
long num,dig,sum;
Scanner sc =new Scanner(System.in);
System.out.print("Enter a number :");
num=sc.nextLong();
do
{
sum = 0;
while(num!=0)
{
dig=num%10;
sum+=dig;
num/=10;
}
System.out.print("->"+sum);
num=sum;
}
while(num/10!=0);
}
}