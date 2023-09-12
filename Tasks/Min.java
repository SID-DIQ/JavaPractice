public class Min {
    public static void main(String[] args) {
                                // 0 1 2 3
        int[] numbers = new  int[]{1,0,5,6};
        int len=numbers.length;  
       int min = numbers[0]; //1 0
       for(int s=0; s<len; s++)//0 1
       {    //0 1 2 3
        if( min>numbers[s]) //  1>1 1>0 0>6
        {
           min = numbers[s];// min=0
        }
       } 
 System.out.println("MIn value "+ min);
    }
}