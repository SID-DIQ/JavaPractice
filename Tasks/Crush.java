public class Crush {
    public static void main(String[] args) {
        int num=10;
        int even=0;
        int odd=0;
        int sum=0;
        int rem=0;
        int f=3;
        int result=1;
        int finalans=0;
        for(int i=1; i<=num; i++){
            if(i%2==0)
            {
                even=even+i;
            }
            else if(i%2==1)
            {
                odd=odd+i;
            }   
        }
        System.out.println("sum of Odd Numbers"+odd);
        System.out.println("Sum of Even Numbers :"+even);
        sum=even-odd;
        System.out.println("Sum of even and Odd Numbers:"+sum);
         rem=sum%10;  
        for(int a=1;a<=f;a++){
            result=result*rem;
        }
        System.out.println(result);
        finalans=sum*result;
        System.out.println("Final value :" +finalans);    
    }
    }