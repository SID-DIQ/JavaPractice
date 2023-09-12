public class BiggestAmongThreeNum {
    public  static void main(String[]args){
        int num1=1000;
        int num2=300;
        int num3=50;
        if(num1>num2 && num1>num3){
            System.out.println(" num1 is bigger then num2 and num3" );
            System.out.println(num1+2);

        }
        else if(num2>num3){
            System.out.println("num2 is bigger then num1 and num3");
        }
        else
        System.out.println("num3 is bigger then num1 and num2");
    }
}
