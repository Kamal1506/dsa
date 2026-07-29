import java.util.*;
class main{
  public static void main(String args[]){
    int arr[] = {0, 2, 1, 5, 3, 4};
    int res[] = new int[arr.length];
    for(int i = 0; i<arr.length; i++){
      res[i] = arr[arr[i]];
    }
    System.out.println(Arrays.toString(res));
  }
}
