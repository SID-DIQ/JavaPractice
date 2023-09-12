public class Evenorodd {
    public static void main(String [] args){
        int num1=1234;
        int num2=5678;
        int num3=9012;
        int num4=3456;
        int evensum=0;
        int oddsum=0;
        while(num1>0)
        {
            int digit_num1=num1%10;
            if(digit_num1%2==0)
                evensum+=digit_num1;
            else
                oddsum+=digit_num1;
            num1/=10;
        }
     while(num2>0)
        {
            int digit_num2=num2%10;
            if(digit_num2%2==0)
                evensum+=digit_num2;
            else
                oddsum+=digit_num2;
            num2/=10;
        }
     while(num3>0){
            int digit_num3=num3%10;
            if(digit_num3%2==0)
                evensum+=digit_num3;
            else
                oddsum+=digit_num3;
            num3/=10;
     }
         while(num4>0){
            int digit_num4=num4%10;
            if(digit_num4%2==0)
                evensum+=digit_num4;
            else
                oddsum+=digit_num4;
            num4/=10;
        }
            System.out.println("The Even sum is :"+evensum);
            System.out.println("The Odd sum is :"+oddsum);
    
    }    
}
