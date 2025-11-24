import java.util.*;

public class PalindromeNumber{
  public boolean isPalindrome(int x) {
    String strNumb = Integer.toString(x);
    boolean out = false;
    List<Integer> list = new ArrayList<Integer>();
    //Creates a list of the Integer input
    for (int i = 0; i < strNumb.length();i++){
        list.add(strNumb.charAt(i) - '0');
    }

    //Copies the list and revereses it
    List<Integer> copy = new ArrayList<Integer>(list);
    Collections.reverse(copy);

    //Compares the original to the copy to see if they are Exactly the Same
    if (list.equals(copy)){
        out = true;
    } else {
        out = false;
    }

    return out;
  }
}
