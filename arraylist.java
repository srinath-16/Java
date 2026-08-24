import java.util.*;
public class arraylist {
  public static void main(String[]args){
    // declare arraylist->string
    ArrayList<String> list = new ArrayList<String>();
    // add()-> to insert the element end of  the arraylist
    list.add("is");
    list.add("a");
    // addfirst()-> to insert the element front of the arraylist
    list.addFirst("he");
    //addlast()-> to insert the element at end of the arraylist
    list.addLast("good");
    list.addLast("boy");
    //set()-> to replace the element at specified index
    list.set(3, "bad");
    //add(idex,element)-> to insert the element at specified index
    list.add(2,"also");
    //get()-> to return the element at specified index
    System.out.println("second Element: "+list.get(1));
    //to retrieve all the elements of arraylist
    System.out.println("using for- loop print retrive list : ");
    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i)+"");
    }

    //to retrieve all the elements of arraylist
    System.out.println("using for-each loop print retrive list : ");
    for(String s : list){
      System.out.println(s+" ");
    }
    //remove ()-> to remove object
    list.remove("boy");
    //remove(index)-> to remove object at specified index
    list.remove(4);
    System.out.println("List: "+list);
    //sort()-> to sort the arraylist
    Collections.sort(list);
    System.out.println("Sorted List: "+list);

  }
  
}
