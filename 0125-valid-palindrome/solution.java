class Solution {
    public boolean isPalindrome(String s) {
        String cstr=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left=0;
        int right=cstr.length()-1;
        while(left<right)
        {
            if(cstr.charAt(left)!=cstr.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
       }
}
