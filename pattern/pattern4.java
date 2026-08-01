import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n = 5;
      for(int i = 1; i<=2*n; i++){
        int columns = i>n ? (2*n)-i : i;
        for(int spaces = 1; spaces<=(n-columns); spaces++){
          System.out.print(" ");
        }
        for(int col = columns; col>=1; col--){
          System.out.print(col);
        }
        for(int col = 2; col<=columns; col++){
          System.out.print(col);
        }
        System.out.println();
      }
    }
}

pattern :

    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1
