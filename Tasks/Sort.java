public class Sort {
    public static void main(String[] args) {
                            //0 1 2 3 4
        int [] age =new int[]{5,8,6,4,7}; //4,8,6,5,7
        int len=age.length;
        for(int i=0;i<len;i++)//i=0 1
        {
            for(int j=i+1;j<len;j++)//0+1 j=2
            //   i=0   j=0+1=2 3
            if(age[i]<age[j]) //5>4
            {
                int tem=age[i]; //tem=5
                age[i]=age[j];  //age[i]=4
                age[j]=tem;     //age[j]=5
            }
        }
            for(int i=0;i<len;i++)
            {
                System.out.print(age[i]+ " " +" ");//1tym
            }
        /*System.out.println("second Min val :" + age[1]);
        System.out.println("second Max val :" + age[len-2]);*/
    }
}