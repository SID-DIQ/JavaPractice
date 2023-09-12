import java.util.Scanner;
public class Mock3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        sc.close();
        int count=0,count1=0,count2=0,count3=0;
     for(int i=2; i<num; i++){
        if(num%i==0)
        count++;
     }
     if(count==0){
        System.out.println("The Given Number is Prime");
     }
     else{
        System.out.println("The Given Number is Not Prime");
     }
     for(i){
        num=num/10;
    }
    for(int j=2; j<num; j++){
        count1++;
    }
    if(count1==0){
        System.out.println("The given Num is prime");
    }
    else{
        System.out.println("The Given Num is Not Prime");
    }
    while(num!=0){
        num=num/100;
    }
    for(int j=2;j<num;j++){
        count2++;
}
    if(count2==0){
        System.out.println("The given Num is prime"+num);   
    }
    else{
        System.out.println("The Given Num is Not Prime"+num);
    }
    while(num!=0){
      num=num/1000;
    }
    for(int j=2;j<num;j++){
        count3++;
}
    if(count3==0){
        System.out.println("The given Num is prime"+num);   
    }
    else{
        System.out.println("The Given Num is Not Prime"+num);
    }
    }
}

