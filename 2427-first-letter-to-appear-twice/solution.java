class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> val = new HashSet<>();
        for(char a:s.toCharArray()){
            if(!val.add(a)) return a;
        }
        return 'a';
    }
}
