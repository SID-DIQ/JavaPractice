import java.util.*;
public class SpecialChar {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string : ");
    String str=sc.next();
    sc.close();
    str=str.replaceAll("[^a-zA-Z0-9]","");
    System.out.println(str);
    }
}
