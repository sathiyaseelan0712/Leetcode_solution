class Solution {
    public boolean isDiv(int n){
        if( n% 2 == 0 && n % 3==0)return true;
        return false;
    }
    public int average(List<Integer> nums){
        int sum = 0;
        int n = nums.size();
        for(int i : nums) sum += i;
        return sum/n;
    }
    public int averageValue(int[] nums) {
        List<Integer> val = new ArrayList<>();
        for(int i : nums){
            if(isDiv(i)){
                val.add(i);
            }
        }
        if(val.size() != 0) return average(val);
        return 0;
    }
}
