class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = (int) Math.ceil((double) b.length() / a.length());
        for(int i = 0; i < count; i++) {
            sb.append(a);
        }
        if(sb.toString().contains(b)) return count;
        sb.append(a);
        if(sb.toString().contains(b)) return count + 1;
        return -1;
    }
}

// https://leetcode.com/problems/repeated-string-match/description/
