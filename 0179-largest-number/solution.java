class Solution {
    public String largestNumber(int[] nums) {
        String[] numsString = new String[nums.length];
        for(int i =0 ;i<nums.length;i++){
            numsString[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numsString, (a,b) -> (b+a).compareTo(a+b));

        if(numsString[0].equals("0")){
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for(String ans :numsString) result.append(ans);

        return result.toString();
    }
}
