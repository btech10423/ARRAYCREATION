import java.util.*;
public class kadanesalgo {
  public static void Kadanes(int numbers[]) 
  {
    //applicable only when all numbers are not negative
    int ms = Integer.MIN_VALUE;
    int currsum = 0;
    for(int i=0; i<numbers.length; i++)
    {
        currsum+=numbers[i];
        if(currsum<0)
        {
        currsum=0;
        }
       ms = Math.max(ms,currsum);
    }
    System.out.print("maxsum is " + ms);
  } 
  public static void main(String args[]) 
  {
    int numbers[] = {-1, -2, -3, 4, 5, -1};
    Kadanes(numbers);
  }
}
