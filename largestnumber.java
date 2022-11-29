import java.util.*;
public class largestnumber {
     public static int Getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
    for(int i=0; i<numbers.length; i++)
    {
        if(numbers[i]>largest)
        {
         largest = numbers[i];
        }
    }
    return largest;
    }
    public static void main(String args[])
    {
        int numbers[] = {1,2,3,4,6};
    
    System.out.println("the largest number is " + Getlargest(numbers));
    }
}