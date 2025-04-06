class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> m = new HashMap<>();
        for(char a : s.toCharArray()){
            m.put(a,m.getOrDefault(a,0)+1);
        }
        int cnt = 0;
        int idx = 0;
        for(char a : s.toCharArray()){
            if(m.get(a)==1){
                return idx;    
            }
            idx++;
        }
        return -1;
    }
}
