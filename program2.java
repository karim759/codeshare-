//pg2
//Non recursive
import java.util.*;
 public class FibonacciSeries
{
    public static void main(String args[])
{
        int nterms, first = 0, second = 1, current, i;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of terms in Fibonacci Series");
        nterms = in.nextInt();

        for(i = 0; i < nterms; i++)
 {
            if(i < 2)
            {
                current = i;
            }
            else
             {
                current = first+ second;
                first=second;
                second=current;
            }
            System.out.print(current + " ");
        }
    }
}

//pg2
//Recursive:
import java.util.*;
 public class FibonacciSeriesRecursion
{
    public static void main(String args[])
{
        int terms, i;
         Scanner in = new Scanner(System.in);
       System.out.println("Enter number of terms in Fibonacci Series");
       terms = in.nextInt();
       for(i = 0; i < terms; i++)
       {
           System.out.print(fibonacci(i) + " ");
       }
 }

    public static int fibonacci(int num)
    {
         if(num < 2)
            return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}