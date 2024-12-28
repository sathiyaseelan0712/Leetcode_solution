class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if (!m.containsKey(str)) {
                m.put(str, new ArrayList<>());
            }
            m.get(str).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
