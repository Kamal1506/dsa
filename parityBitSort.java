import java.util.*;
class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                int count = Integer.bitCount(num);
                if(count % 2 == 0)
                    even.add(num);
                else
                    odd.add(num);
            }
            Collections.sort(even);
            Collections.sort(odd);
            StringBuilder res = new StringBuilder();
            for(int x : even)
                res.append(x).append(" ");
            for(int x : odd)
                res.append(x).append(" ");
            System.out.println(res.toString().trim());
        }
    }
}

//  hackerearth link : https://www.hackerearth.com/problem/algorithm/parity-binary-sort-ea768e57/?source=list_view

