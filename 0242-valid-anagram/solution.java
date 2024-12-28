class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length(), c = t.length();
        if(c!=n){
            return false;
        }
        HashMap<Character, Integer> m = new HashMap<>();

        for(char a : s.toCharArray()){
            m.put(a, m.getOrDefault(a,0)+1);
        }
        for(char b : t.toCharArray()){
            if(m.containsKey(b)){
                m.put(b, m.get(b)-1);
            }
            else{
                return false;
            }
        }
        for(char a :s.toCharArray()){
            if(m.get(a) != 0){
                return false;
            }
        }
        return true;
    }
}
