class Solution {
    private static void backTrack(int[] nums,int start,List<Integer> temp,List<List<Integer>> ans){
        if(temp.size() == 3){
            int sum = temp.get(0) + temp.get(1) + temp.get(2);
            if(sum == 0){
                if(!ans.contains(temp)){
                    ans.add(new ArrayList<>(temp));
                }
            }
            return;
        }

        for(int i = start;i<nums.length;i++){
            temp.add(nums[i]);
            backTrack(nums,i+1,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        Arrays.sort(nums);

        for(int i = 0;i+2<n;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = n-1;

            while(left  < right){

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[left++],nums[right--]));
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        // backTrack(nums,0,new ArrayList<>(), ans);
        return ans;
    }
}
