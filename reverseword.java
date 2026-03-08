class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("\\s+"," ").trim();
        String str[] = s.split(" ");
        int ind = 0;
        String news[] = new String[str.length];
        for(int i = str.length-1 ; i>=0 ; i--){
            news[ind++] = str[i];
        }
        return String.join(" ",news);
    }
}