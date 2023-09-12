import java.util.Scanner;
 class Mock1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int a=sc.nextInt();
        sc.close();
        System.out.println("Given Number is " + a);
        int sum=0;
        int i=1;
        int b=0;
        int sum2=0;
        int sum3=0;
        for(i=1; i<=a; i++){
            if(a%i==0){
         //  System.out.println("The Facts Are :"+i);
        sum=sum+i;        
            }
        }
            System.out.println("Sum Of Facts Are :"+sum);
   while(sum!=0){
        int rem=sum%10;  //82
        b=b+rem;        //0+8=8+=10
        sum=sum/10;
    }
  System.out.println("Sum of Digits of Fact"+b);
  int d=b;
 // System.out.println(d);
  while(d!=0){
    sum2=d%10;
    sum3=sum2+sum3;
    d=d/10;  
}
System.out.println("sim"+ sum3);
    }
 }