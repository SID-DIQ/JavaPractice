import java.util.Scanner;

public class DupChar {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range : ");
    int range=sc.nextInt();
    sc.close();
    String []arr=new String[range];//6
    int count;
    System.out.println(" Enter The elements :");
    for(int i=0;i<range;i++){
        arr[i]=sc.next();//1 2 2 3 4 5
    }
    for(int i=0;i<range;i++){
        count=0;
        for(int j=i+1;j<range;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count==0){
            System.out.print( arr[i]+ " ");
        }
    }
 }   
}
