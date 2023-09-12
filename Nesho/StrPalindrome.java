import java.util.*;
public class StrPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str=sc.nextLine();
        sc.close();
        boolean isPalindrome=true;
        for(int i=0, j=str1.length()-1; i<j; i++, j--)
        {
            if(str1.charAt(i)==str1.charAt(j))
            continue;
            isPalindrome=false;
            break;
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
    }
}
