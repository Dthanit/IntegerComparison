import java.util.Scanner;
import java.util.*;
public class IntegerComparison
{
    public static void main(String[]args)
	{  
      checkPositive(x);
      checkNegative(x);
    }
    static boolean checkPoint(int x)
    {
     Scanner in = new Scanner(System.in); 
     System.out.print("Enter Number => ");
     int x = in.nextInt();
     
     if(x>0)
     {return true;}
     else
     {return false;}
     
    }
    static boolean checkNegative(int x)
    {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter Number => ");
        int x = in.nextInt();
        
      if(x<0)
      {return true;}
      else
      {return false;}
     
    }
}
