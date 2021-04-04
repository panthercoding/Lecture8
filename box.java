import java.util.*;

public class box{

  public static boolean boxSearch(ArrayList<String> Box){
    int numItems = Box.size();
    if (numItems == 0)
      return(false);  //stop if the box is empty

    //retrieve the last item in the box
    String item = Box.get(numItems - 1);
    if (item.compareTo("star") == 0)
      return(true); //stop if have found the star 
    else{
      Box.remove(numItems - 1); //remove last item
      return boxSearch(Box); //search remaining box
    }
  }

  public static void main(String[] args){
    ArrayList<String> Box = new ArrayList<String>();
    //Box.add("star");
    Box.add("triangle");
    Box.add("circle");
    Box.add("cube");
    System.out.println(boxSearch(Box));
  }
}
