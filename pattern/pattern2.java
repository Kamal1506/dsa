import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n = 5;
      for(int i = 1; i<2*n; i++){
        int column = i>n ? (2*n)-i : i;
        int spaces = n-column;
        for(int k = 1; k<=spaces; k++){
          System.out.print(" ");
        }
        for(int j = 1; j<=column; j++){
          System.out.print("* ");
        }
        System.out.println();
      }
    }
}


pattern:

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
