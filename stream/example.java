import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      list.add("Banana");
      list.add("Apple");
      list.add("Orange");
      list.add("Another");

      List<String> list2 = Arrays.asList("kamal", "prakash", "dinesh", "Dinesh");
      Collections.sort(list2);
      System.out.println(list2);

      Collections.sort(list);
      System.out.println(list);  
      System.out.println();

      list.stream().sorted().forEach(System.out::println);
      System.out.println();

      System.out.println(list.stream().sorted().collect(Collectors.toList()));
      List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
      System.out.println(sortedList);

      //integer example

      List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 6);
      list.stream().filter(sn -> sn%2==0).forEach(System.out::println);
      System.out.println();

      list.stream().distinct().forEach(System.out::println);
      System.out.println();

      list.stream().skip(3).limit(2).forEach(System.out::println);
      System.out.println();

      System.out.println(list.stream().distinct().filter(n -> n%2 == 0).count());
      List<Integer> mapped = list.stream().map(n -> n*10).collect(Collectors.toList());
      System.out.println(mapped);
    }
}


// Most Important Stream Methods for Freshers
// Method	       Purpose	                              Example
// stream()	     Create a stream	                      list.stream()
// filter()	     Select matching elements	              Even numbers
// map()	       Transform elements	                    Multiply by 10
// sorted()	     Sort elements	                        Alphabetical order
// distinct()	   Remove duplicates	                    [1,2,2,3] → [1,2,3]
// limit()	     Take first n elements	                First 5
// skip()	       Skip first n elements	                Skip first 2
// count()	     Count elements	                        Total even numbers
// forEach()     Iterate over elements	                Print all values
// collect()   	 Convert stream back to a collection	  Collectors.toList()
