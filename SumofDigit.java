public class SumofDigit {
    public static void main(String[] args){
        int a=1234;
        int sum=0;
    
        while(a!=0){
           int b=a%10;//4//3//2
            sum+=b;//4+3=7+2=9
            a/=10;//123//12
          
        }
        System.out.println( sum);
        
    }
}
