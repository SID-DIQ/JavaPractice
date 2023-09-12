import java.util.*;
public class Wheel {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int wheel=sc.nextInt();
    sc.close();
    int res=0,res1=0;
    for(int i=1;i<=200;i++){
        if(i%4==0){
            res++;
            wheel--;
        }
        else{
            res1++;
        }
        if(i%4==0 && i%2==0 && res+res1==200){
            System.out.println("The Number of Cars : " + res);
            System.out.println("The Number of bike : " + res1);
        }
    }
 }   
}
