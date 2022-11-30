import java.util.*;
public class maxsumsubarray {
   public static void Maxsumsubarray(int numbers[]) 
   {
    int currSum=0;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0 ; i<numbers.length; i++)
    {
        for(int j=i ; j<numbers.length; j++)
        { 
            currSum=0;
            for(int k=i ; k<=j; k++)
            {
              //System.out.print(numbers[k] + " ");
             currSum+=numbers[k];
            }
             System.out.println(currSum);
            
             if(maxsum<currSum)
             {
                maxsum = currSum;
             }
            
        }   
    }
    System.out.println("maxsum is " + maxsum);
   }
   public static void main(String args[]) 
   {
    int numbers[] = {1,2,3,4,5,6};
    Maxsumsubarray(numbers);
   }
}

