class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = i+1;
        }
        for(int i=0;i<n;i++){
            arr[nums[i]-1] = 0;   
        }
        for (int i : arr){
            if( i!=0) ans.add(i);
        }
        return ans;
    }
}
