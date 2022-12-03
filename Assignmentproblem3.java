import java.util.*;
public class Assignmentproblem3 {
   public static int assignment3(int prices[])
   {
int mp=0,buy=prices[0];
for(int i=0; i<prices.length;i++)
{
    if(prices[i]>buy)
    {
        mp=Math.max(mp,prices[i]-buy);
    }
    else 
    {
       buy=prices[i];
    }
}
return mp;
   }
   public static void main(String args[])
   {
    int prices[]={7,6,1,4,3};
    System.out.println(assignment3(prices));
   }
}


