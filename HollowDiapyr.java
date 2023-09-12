public class HollowDiapyr {
    public static void main(String[] args) {
        int i,j,k;
    for(i=1;i<=5;i++)
    {
        if(i==1 || i==5)
        {
            for(k=1;k<=5;k++)
            {
                System.out.print("* ");
            }
        }
        else
        {
            for(j=1;j<=5;j++)
            {
                if(j==1 || j==5)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
        }
        System.out.print("\n");
    }   
for(i=1;i<=5;i++)
        {
            for(k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            if(i==1 || i==2 )
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
        }
            else
            {
                for(j=1;j<=i;j++)
                if(j==1 || j==i)
                {
                    System.out.print("* ");
                }
            else{
                System.out.print("  ");
            }
            }
            System.out.print("\n");}
        for(i=4;i>=1;i--)
        {
            for(k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            if(i==1 || i==2 )
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
        }
            else
            {
                for(j=1;j<=i;j++)
                if(j==1 || j==i)
                {
                    System.out.print("* ");
                }
            else{
                System.out.print("  ");
            }
            }
            System.out.print("\n");
        }
        }
    }

