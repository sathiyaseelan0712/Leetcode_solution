class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup = new ArrayList<>();
        Set<Integer> dis = new HashSet<>();
        for(int i : nums){
            if(!dis.contains(i)) dis.add(i);
            else dup.add(i);
        }
        return dup;
    }
}
