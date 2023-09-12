import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        sc.close();
        int digit=0,res=0,num2=num;
        while(num!=0){
        digit=num%10;
        num=num/10;
        res=res*10+digit;
        }
        if(res==num2){
        System.out.println(res+"Number Is Palindrome");
    }
    else{
        System.out.println(res+"Is Not A Palindrome");
    }
}

}
