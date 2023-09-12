import java.util.*;
public class Ebay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" ENTER THE NUMBER OF PRODUCT :");
        int noOfProducts=sc.nextInt();
        int price[]=new int[noOfProducts];
        int distance[]=new int[noOfProducts];
        int sku[]=new int[noOfProducts];
        System.out.println("ENTER THE PRICE :");
        for(int i=0;i<noOfProducts;i++)
        price[i]=sc.nextInt();
        System.out.println("ENTER THE DISTANCE");
        for(int i=0;i<noOfProducts;i++)
        distance[i]=sc.nextInt();
        System.out.println("ENTER THE STOCK IN UNIT: ");
        for(int i=0;i<noOfProducts;i++)     
        sku[i]=sc.nextInt();
        sc.close();

        int finalPrice[]=new int[noOfProducts];
        int count =0;

        for(int i=0;i<noOfProducts;i++)
        {
        if(sku[i]>0)
        {
        finalPrice[count]= price[i] * distance[i];
        count++;
        }
    }

    for(int i=0;i<count;i++)
    {
    System.out.print(finalPrice[i]+" ");    
    }
    }
}