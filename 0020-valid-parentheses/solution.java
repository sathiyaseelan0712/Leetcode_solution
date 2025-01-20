class Solution {
    public boolean isValid(String s) {
        int n= s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char a = s.charAt(i);
            if(a == '(' || a == '{' || a == '['){
                st.push(a);
            }else{
                if(st.empty()) return false;
                char b = st.pop();
                if(a == ')' && b!='(') return false;
                else if(a == '}' && b!='{') return false;
                else if(a == ']' && b!='[') return false;
            }
        }
        return st.empty();
    }
}
