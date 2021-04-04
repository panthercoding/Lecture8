import java.util.*;

public class fibonacci{

  public static void main(String[] args){
    int min = Integer.parseInt(args[0]);
    int max = Integer.parseInt(args[1]);
    for (int i = min; i <= max; i++){
      System.out.println("fib(" + i + "): " + fib_dynamic(i));
    }
  }

  //calculates the nth fibonacci number via recursion
  public static int fib(int n){
    if (n == 0)
      return 0;
    else if (n == 1)
      return 1;
    else 
      return fib(n-1) + fib(n-2);
  }

  //stores each fibonacci number in a large buffer array -> non-recursive
  public static int fib_dynamic(int n){
    int[] buffer = new int[n + 1]; //store 0 thorugh n
    buffer[0] = 0;
    buffer[1] = 1;
    for (int i = 2; i <= n; i++){
      buffer[i] = buffer[i - 1] + buffer[i-2];
    }
    return buffer[n];
  }

  //calculates the nth fibonacci numbers more intelligently and recursively
  //by storing the previously calculated values in a large buffer array
  public static long fib_efficient(int n, long buffer[]){
    if (n <= 1)
      return (long)n;
    else if (buffer[n] != 0){ //fib(n) is in the buffer array
      return buffer[n];
    }
    else{ //buffer not in the array
      long value = fib_efficient(n - 1, buffer) + fib_efficient(n - 2, buffer);
      buffer[n] = value;
      return(value);
    }
  }

}
