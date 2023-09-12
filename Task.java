public class Task {
    public static void main(String[] args) {
        int num=54,rem=0,rem1=0,count=0,count1=0;
        for(int k=1; k<2; k++)
        {
            rem=num%10;
            num/=10;
        }
        for(int h=1; h<=1; h++){
            rem1=num%10;
            num=num/10;
        }
        for(int i =2; i<=rem; i++)
        {
            if(rem%i==0)
            count=count+1;
        }
        if(count==1){
            System.out.println(rem+" The given Number Is priime");
        }
        else{
        System.out.println(rem +" The Given NUumber Is Not a Prime");
        }
        for(int j =2; j<rem1; j++)
        {

            if(rem1%j==0)
            count1++;
        }  
        if(count1==0){
            System.out.println(rem1+" The given Number Is priime");
        }
        else{
        System.out.println(rem1+" The Given NUumber Is Not a Prime");
    }
}
}
