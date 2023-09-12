import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num1=s.nextInt();
        s.close();
        int count=0;
        int  num2=num1;//num1=153..
        int res=0;
        while(num2!=0){
            count = count+1; //0+1=1...,1+1=2..,2+1=3
            num2=num2/10; //153/10=15...,15/10=1..,1/10=0
           // System.out.println(count); ///3
        }
        num2=num1;  //num2=153
        for(int i=0; i<count; i++){
            int lastdigit=num1%10;  //153%10=3..,15%10=5..5%10=5
            int temp=1;
            for(int j=0; j<count; j++){
                temp=temp*lastdigit; //1*3=3...,3*5=15..,
            }
           // System.out.println(lastdigit);
            res=res+temp;
            num1=num1/10;
        }
        //System.out.println(res);
        if(res==num2){
            System.out.println(" The Given Number is Armstrong Number");
          }
          else
          System.out.println("The Given Number Is Not Armstrong ");
    }
}