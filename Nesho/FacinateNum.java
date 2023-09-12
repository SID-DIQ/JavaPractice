import java.util.*;
import java.util.Arrays;
public class FacinateNum {
    static void sortString(String str)
    {
        char [] ch={'1','2','3','4','5','6','7','8','9'};
        int c=0;
        char [] arr=str.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<9;i++){
        if(ch[i]==arr[i])
            c++;
    }
    if(c==9)
    System.out.println("Facinate Number");
    else
    System.out.println("NOt Facinate");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int pro1=num*2;
        int pro2=num*3;
        String s1=Integer.toString(num);
        String s2=Integer.toString(pro1);
        String s3=Integer.toString(pro2);
        String s5=s1+s2+s3;
        sortString(s5);

    }
}