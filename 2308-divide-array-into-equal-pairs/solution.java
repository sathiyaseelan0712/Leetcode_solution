class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i : nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(Integer a : m.keySet()){
            if(m.get(a) % 2 != 0){
                return false;
            }
        }
        return true;
    }
}
