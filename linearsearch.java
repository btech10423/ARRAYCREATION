import java.util.*;
public class linearsearch{
    public static int Linearsearch(int numbers[], int key)
    {
for(int i=0; i<numbers.length; i++)
{
    if(numbers[i]==key)
    {
        return i;
    }
}
return -1;
    }
     public static void main(String args[]) 
    {
        int numbers[] = {10,20,30,40,50};
        int key = 50;

        int index = Linearsearch(numbers, key);
        if(index==-1)
        {
        System.out.println("Not found");
        }
        else
        {
        System.out.println("key is at index:"+index);
        }
    }
}
