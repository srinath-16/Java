import java.util.HashSet;
public class Hashset{
  public static void main(String[]args){
    // declare hashset->string
    HashSet<String> set = new HashSet<String>();
    // add()-> to insert the element in the hashset
    set.add("5");
    set.add("8");
    set.add("29");
    set.add("105");
    System.out.println("original hashset: "+set);
    set.add("15");
    System.out.println("after adding 15 : "+set);
    //to check the element is present or not in the hashset
    System.out.println("is 29 contain ?: "+set.contains("29"));
    //to remove the element from the hashset
    set.remove("105");
    System.out.println("after removing 105: "+set);
    //to itrate over the hashset
    for(String num: set){
          System.out.println(num+" ");
    }

      //remove everthing from the hashset
      set.clear();
  }

}
