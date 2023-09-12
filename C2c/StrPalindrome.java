import java.util.*;
public class StrPalindrome {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char ch;
    String str=sc.nextLine();
    sc.close();
    String rev="";
    for(int i=0;i<str.length();i++){
        ch=str.charAt(i);
        rev=ch+rev;
    }
    System.out.println(rev);
    if(str.equals(rev))
    System.out.println("Is Palindrome");
    else
    System.out.println("Not a Palindrome");
    }
}
