class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if(digits == null || digits.length() == 0){
            return res;
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        backTrack(digits, 0, new StringBuilder(), res, map);

        return res;
    }

    public void backTrack(String digits, int idx, StringBuilder sb, List<String> res, Map<Character, String> map){
        if(digits.length() == idx){
            res.add(sb.toString());
            return;
        }
        String letters = map.get(digits.charAt(idx));
        for(char let : letters.toCharArray()){
            sb.append(let);
            backTrack(digits, idx+1, sb, res, map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
