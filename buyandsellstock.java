import java.util.*;
public class buyandsellstock {
   public static int Buyandsellstock(int prices[])
   {
int maxpro=0;
int buyprice = Integer.MAX_VALUE;
for(int i=0; i<prices.length; i++)
{
    if(buyprice<prices[i])
    {
        int profit = prices[i] - buyprice;
        maxpro = Math.max(maxpro,profit);
    }
    else 
    {
        buyprice=prices[i];
    }
}
return maxpro;
   }
   public static void main(String args[])
   {
    int prices[]={7,1,5,3,6,4};
    System.out.println(Buyandsellstock(prices));
   }
}
