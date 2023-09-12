import java.util.*;
public class Vowels {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int v=0;
    System.out.println("Enter the String :");
    String s=sc.next();
    //s=s.toLowerCase();
    System.out.println(s);
    sc.close();
    int len=s.length();
    for(int i=0;i<len;i++)
    {
        if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || 
           s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
        v++;
    }
    System.out.println("Totel String Count :" + len);
    System.out.println("Totel Vowels Count :"+ v);
    System.out.println("Totel Consonent Count :" + " "+ (len-v));
    }
}
