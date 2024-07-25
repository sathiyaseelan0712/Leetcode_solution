class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int sum=0,n=nums.length,a,b,c;
        for(int i=n-1;i>1;i--)
        {   
            a=nums[i-2];
            b=nums[i-1];
            c=nums[i];
            sum=a+b+c;
            if(a+b>c){
                return sum;
            }
        }
        return 0;        
    }
}
