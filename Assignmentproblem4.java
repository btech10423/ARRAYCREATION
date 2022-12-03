import java.util.*;
public class Assignmentproblem4 {
    public static int assignment4(int height[])
    {
      int n = height.length, res = 0, l=0 , r=n-1 , lMax = height[l] , rMax = height[r];
      while(l<r)
      {
        if(lMax<rMax)
        {
            l++;
            lMax=Math.max(lMax,height[l]);
            res+=lMax-height[l];
        }
      else
        {
        r--;
        rMax = Math.max(height[r], rMax);
        res+=rMax-height[r];
        }
    
      }
      return res;
    }
    public static void main(String args[])
    {
        int height[] = {4,2,0,3,2,5};
        System.out.println(assignment4(height));
    }

}