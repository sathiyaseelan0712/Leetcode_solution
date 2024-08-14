class Solution {
    public int smallestDistancePair(int[] nums, int k) {
       Arrays.sort(nums);
       int n=nums.length;
       int minDis=0;
       int maxDis = nums[n-1]-nums[0];
       while(minDis<maxDis){
        int midDis= minDis + (maxDis-minDis)/2;
        int pair=countPair(nums,midDis);
        if(pair<k){
            minDis= midDis +1;
        }
        else{
            maxDis=midDis;
        }
       }
       return minDis;
    }

    public int countPair(int nums[],int midDis){
        int count=0;
        int left=0;
        int n=nums.length;
        for(int right=1;right<n;right++){
            while(nums[right]-nums[left]>midDis){
                left++;
            }
            count+=right-left;
        }
        return count;
    } 

}
