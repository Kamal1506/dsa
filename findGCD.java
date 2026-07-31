import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int ans = sc.nextInt();

      for(int i = 1; i<n; i++){
        int x = sc.nextInt();
        ans = gcd(ans, x);
      }
      System.out.println(ans);
    }

    public static int gcd(int a, int b){
      while(b!=0){
        int rem = a%b;
        a = b;
        b= rem;
      }
      return a;
    }
}
