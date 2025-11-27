class Solution {
    public boolean isPalindrome(String s) {

    /*Websites Used
    Learnt how to remove punctuation and white space from the String
    //https://www.baeldung.com/java-remove-punctuation-from-string
    //https://stackoverflow.com/questions/5455794/removing-whitespace-from-strings-in-java
    */

    String curr = s.toLowerCase().replaceAll("[^\\sa-zA-Z0-9]", "").replaceAll("\\s+","");

    boolean out = false;
    List<Character> list = new ArrayList<Character>();
    //Creates a list of the Integer input
    for (int i = 0; i < curr.length();i++){
        list.add(curr.charAt(i));
    }

    //Copies the list and revereses it
    List<Character> copy = new ArrayList<Character>(list);
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
