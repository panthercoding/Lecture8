public class power{
  /* calculates a to the power to b
  which is equal to a multiplied by itself b times */
  public static int exp(int a, int b){
    if (b == 0){
      return 1; //a^0 is always equal to 1
    }
    else{
      return a * exp(a,b-1); //a^b = a * a^(b-1)
    }
  }
}
