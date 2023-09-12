import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" ENTER THE int");
        int num=sc.nextInt();
        System.out.println(" ENTER THE float");
        float f=sc.nextFloat();
        sc.nextLine();
        System.out.println(" ENTER THE LINE");
         String str=sc.nextLine();
         System.out.println(" ENTER THE word");
        String str1=sc.next();
        System.out.println("ENTER THE CHAR");
        String ch=sc.next();
        System.out.println("int = "+ num + " \n float " + f + " \nline :" + str  + "\nword " + str1 + "\nchar= " + ch );
    }
}
