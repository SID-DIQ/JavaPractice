import java.util.*;
import java.util.Arrays;
public class Anagram  {
   public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The String");
    String str1=sc.nextLine();
    System.out.println("Enter The String");
    String str2=sc.nextLine();
    sc.close();
      if (str1.length()==str2.length()) {
         char[] arr1 = str1.toCharArray();
         Arrays.sort(arr1);
         System.out.println(Arrays.toString(arr1));
         char[] arr2 = str2.toCharArray();
         Arrays.sort(arr2);
         System.out.println(Arrays.toString(arr2));
         System.out.println(Arrays.equals(arr1, arr2));
         if(arr1.equals(arr2)) 
         {
            System.out.println("Given strings not are anagrams");
         } 
         else 
         {
            System.out.println("Given strings are  anagrams");
         }
      }
   }
}