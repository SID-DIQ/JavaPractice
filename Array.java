public class Array {
 public static void main(String[] args) {
                        //0 1  2   3
  int age [] =new int []{33,44,19,24};
    int len=age.length;//4
    int max =age[0];
    int min =age[0];
    for(int i=0; i<len; i++){
       ///System.out.println(age[i]);
        if(max<age[i]){}
        else if(age[i]<min){
        min=age[i];     
    }
}
    System.out.println(max);
    System.out.println(min);
 }   
}