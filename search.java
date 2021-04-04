public class search{

  //binary search -> recursive implementation
  //min and max are the bounds of the search


  public static int bisearch(int list[], int key, int min, int max){
    int mid = (min + max)/2; //take a bisection guess
    if (list[mid] == key){
      return mid; //return index if the key has been found
    }
    else if (min > max){ //exhausted all the elements
      return -1; //never found
    }
    else if (key < list[mid]){ //if key is smaller, search bottom half of array
      return bisearch(list,key,min,mid - 1); //change max value 
    }
    else if (key > list[mid]){ //if key is larger, search upper half of array
      return bisearch(list,key,mid + 1,max); //change min value 
    }
    return(-1); //not found
  }


  public static void main(String[] args){
    int[] list = {1,2,3,5,6,8,10,12,13};
    System.out.println( bisearch(list,3,0,list.length - 1));
  }
}
