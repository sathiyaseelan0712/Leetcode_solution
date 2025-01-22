class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> m = new HashMap<>();
        for(char a:s.toCharArray()){
            if(m.containsKey(a)){
                m.put(a,m.get(a)+1);
            }
            else{
                m.put(a,1);
            }
        }
        List<Integer> l = new ArrayList<>();
        for(int i : m.values()){
            l.add(i);
        }
        int val = l.get(0);
        for(int i=1; i<l.size();i++){
            if(val != l.get(i)){
                return false;
            }
        }
        return true;
    }
}
