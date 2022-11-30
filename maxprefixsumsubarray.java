import java.util.*;
public class maxprefixsumsubarray {
   public static void Maxprefixsumsubarray(int numbers[]) 
   {
    int currSum=0;
    int maxsum=Integer.MIN_VALUE;
    int prefix[] = new int [numbers.length];
    prefix[0]=numbers[0];
    for(int i=1; i<numbers.length; i++)
    prefix[i] = prefix[i-1] + numbers[i];
    for(int i=0 ; i<numbers.length; i++)
    {
        for(int j=i ; j<numbers.length; j++)
        { 
            currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
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
    Maxprefixsumsubarray(numbers);
   }
}


