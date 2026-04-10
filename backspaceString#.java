class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stacked = new Stack<>();
        Stack<Character> stacked2 = new Stack<>();
        for(char i : s.toCharArray()){
            if(i!='#'){
                stacked.push(i);
            }
            else if(!stacked.isEmpty())
            stacked.pop();
        }
        for(char i : t.toCharArray()){
            if( i!='#'){
                stacked2.push(i);
            }
            else if(!stacked2.isEmpty())
                stacked2.pop();
        }
        if(stacked.size() != stacked2.size()) return false;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(!stacked.isEmpty()){
            sb1.append(stacked.pop());
        }
        while(!stacked2.isEmpty()){
            sb2.append(stacked2.pop());
        }
        System.out.print(sb1+" "+sb2);
        if(sb1.toString().equals(sb2.toString())) return true;
        return false;
    }
}


// https://leetcode.com/problems/backspace-string-compare/description/
