class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        ArrayList<Integer> arr = new ArrayList<>(Collections.nCopies(n,-1));
        Stack<Integer> s = new Stack<>();
        for(int i =0;i<n;i++){
            while(!s.isEmpty() && nums2[i] > nums2[s.peek()]){
                int idx = s.pop();
                arr.set(idx,nums2[i]);
            }
            s.push(i);
        }
        int n2 = nums1.length;
        int[] ans = new int[n2];
        for(int i = 0;i<n2;i++){
            for(int j = 0;j<n;j++){
                if(nums1[i] == nums2[j]){
                    ans[i] = arr.get(j);
                }
            }
        }
        return ans;
    }
}
