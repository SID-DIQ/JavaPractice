import java.util.Scanner;
public class DuplicateNum{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
       System.out.println("Enter the array length : ");
        int len = sc.nextInt();
        sc.close();
        int[] dup = new int[len];
        System.out.println("Enter the array values : ");
        for(int i=0 ; i<len; i++){
            dup[i]=sc.nextInt();      
        }
        for(int i=0; i<len; i++){  
           for(int j=i+1; j<len; j++){
                if(dup[i]==dup[j]){
                    System.out.print("\n duplicate value : " + dup[j]);
                }
                else{
                    System.out.print("\n value : " + dup[i]);
                }
            }
        }
    }
}
