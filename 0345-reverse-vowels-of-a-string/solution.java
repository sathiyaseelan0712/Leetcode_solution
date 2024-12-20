class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int left=0;
        int right=n-1;
        Set<Character> vowels = new HashSet<>();
        for(char c: "aeiouAEIOU".toCharArray()){
            vowels.add(c);
        }
        char[] chars = s.toCharArray();
        while(left<right){
            while(left<right && !vowels.contains(chars[left])){
                left++;
            }
            System.out.println(left);
            while(left<right && !vowels.contains(chars[right])){
                right--;
            }
            System.out.println(right);
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right]=temp;

            left++;
            right--;

        }
        return new String(chars);
    }
}
