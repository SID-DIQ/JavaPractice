public class Kite {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {   
            if(i%2==1){
            for(int k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            }
        }
        for(int i=4;i>=1;i--)
        {
            if(i%2==1){
            for(int k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        }
        for(int i=2;i<=3;i++)
        {
            if(i%2==1)
            {
            for(int k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            }
        }
    }
}