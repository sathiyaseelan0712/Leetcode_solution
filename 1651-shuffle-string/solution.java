class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        int m = indices.length;
        StringBuilder sb = new StringBuilder();
        if (n != m)
            return sb.toString();
        Map<Integer,Character> ma = new HashMap<>();
        for(int i = 0 ;i<n;i++){
            ma.put(indices[i],s.charAt(i));
        }
        for(int i=0;i<n;i++){
            sb.append(ma.get(i));
        }
        return sb.toString();
    }
}
