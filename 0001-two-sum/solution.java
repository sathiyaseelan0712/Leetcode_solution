class Solution {
    class Pair{
        int index;
        int value;
        Pair(int _index,int _value){
            index = _index;
            value = _value;
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        Pair[] pair = new Pair[n];

        for(int i = 0;i<n;i++){
            pair[i] = new Pair(i,nums[i]);
        }

        Arrays.sort(pair, (a,b) -> Integer.compare(a.value,b.value));

        // for(int i = 0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if((nums[i] + nums[j]) == target){
        //             ans[0] = i;
        //             ans[1] = j;
        //             break; 
        //         }
        //     }
        // }
        // return ans;

        // Map<Integer,Integer> map =new HashMap<>();
        // for(int i = 0;i<n;i++){
        //     if(map.containsKey(target-nums[i])){
        //         ans[0] = map.get(target - nums[i]);
        //         ans[1] = i;
        //         return ans;
        //     }
        //     map.put(nums[i],i);
        // }
        // return ans;

        int left = 0;
        int right = n-1;

        while(left < right){
            int sum = pair[left].value + pair[right].value;
            if(sum == target){
                ans[0] = pair[left].index;
                ans[1] = pair[right].index;
                return ans;
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        return ans;
    }
}
