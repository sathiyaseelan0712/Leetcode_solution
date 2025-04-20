class Solution {

    private int sort(int[] nums,int left,int mid,int right){
        int cnt = 0;
        int k =mid+1;
        for(int i = left;i<=mid;i++){
            while(k<=right && nums[i] > (2 *(long) nums[k])){
                k++;
            }
            cnt += (k-(mid+1));
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i = left,j=mid+1;
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                arr.add(nums[i++]);
            }else {
                arr.add(nums[j++]);
            }
        }
        while(i<=mid) arr.add(nums[i++]);
        while(j<=right) arr.add(nums[j++]);
        for(int x = left;x<=right;x++) nums[x] = arr.get(x-left);
        return cnt;
    }
    private int merge(int[] nums,int left,int right){
        if(left >= right) return 0;
        int mid = (left+right) / 2;
        int inv = merge(nums,left,mid);
        inv += merge(nums,mid+1,right);
        inv += sort(nums,left,mid,right);
        return inv;
    }
    public int reversePairs(int[] nums) {
        return merge(nums,0,nums.length-1);
    }
}
