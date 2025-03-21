class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> array = new HashSet<>();
        for(int i : nums1){
            if(!array.contains(i)) {
                array.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i:nums2){
            if(array.contains(i) && !ans.contains(i)){
                ans.add(i);
            }
        }
        int[] res = new int[ans.size()];
        int j = 0;
        for(int i= 0 ;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;

    }
}
