public class fact{
  //calculates n!
  public static int factorial(int n){
    if (n == 0)
      return 1; //as 0! = 1
    else 
      return n * factorial(n-1); //n! = n*(n-1)!
  }

  //also calculates n!
  public static int factorial_iterative(int n){
    int result = 1;
    for (int i = 1; i <= n; i++){
      result = result * i;
    }
    return(result);
  }

  //main method
  public static void main(String[] args){
    for (int i = 0; i <= 10; i++)
      System.out.println(i + "! = " + factorial_iterative(i));
  }
}
