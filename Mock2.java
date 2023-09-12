public class Mock2 {
    public static void main(String[] args) {
      int i=0;
        for(i=1; i<=100; i++){
            System.out.println(i);
        if(i%3==0 && i%5==0){
            System.out.println("tizz pizz"+i);
        }
        else if(i%5==0){
            System.out.println("Pizz"+i);
        }
        else if(i%3==0 ){
            System.out.println("tizz "+i);
        }
        }
    }
}
