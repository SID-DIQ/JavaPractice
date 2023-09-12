import java.util.*;
class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number 1:");
        int num1=sc.nextInt();
        System.out.println("Enter The Second Number: ");
        int num2=sc.nextInt();
        System.out.println("Enter The operator :");
        String ch=sc.next();
        sc.close();
        int result;
        switch(ch)
        {
            case "+":
            result=num1+num2;
            break;
             case "-":
            result=num1-num2;
            break;
             case "*":
            result=num1*num2;
            break;
             case "%":
            result=num1%num2;
            break;
             case "/":
            result=num1/num2;
            break;
             case ">>":
            result=num1>>num2;
            break;
             case "<<":
            result=num1<<num2;
            break;
             case ">>>":
            result=num1>>>num2;
            break;
            default:
            System.out.println("Poda Dei!...");

        }

    }
}