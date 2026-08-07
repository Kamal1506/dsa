import java.util.*;

public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      int count = 0;
      for(int i = 1; i<=400; i++){
        if(isArmstrong(i)){
          list.add(i);
          count++;
        }
      }
      System.out.println("Total Count is : "+count);
      System.out.println(list);
    }
    public static boolean isArmstrong(int n){
      int len = Integer.toString(n).length();
      int og = n;
      int sum = 0;
      while(n != 0){
        int rem = n%10;
        sum = sum + (int)Math.pow(rem, len);
        n /= 10;
      }
      if(og == sum){
        return true;
      }
      else{
        return false;
      }
    }
}
