import java.util.*;
class Main{
  public static void main(String args[]){
    int n = 29;
    boolean isPrime = true;
    if(n<=1){
      isPrime = false;
    }
    else{
      for(int i = 2; i<=n/2; i++){
        if(n%2 == 0){
          isPrime = false;
          break;
        }
      }
    }
    System.out.println(isPrime);
  }
}
