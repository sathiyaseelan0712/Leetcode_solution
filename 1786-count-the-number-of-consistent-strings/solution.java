class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> val = new HashSet<>();
        for(char a:allowed.toCharArray()){
            val.add(a);
        }
        for(String s : words){
            int flag = 0;
            for(char a: s.toCharArray()){
                if(!val.contains(a)){
                    flag = 1;
                }
            }
            if(flag == 0) count++;
        }
        return count;
    }
}
