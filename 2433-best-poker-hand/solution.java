class Solution {
    public String bestHand(int[] rank, char[] suits) {
        int[] freq = new int[14];
        int max = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0;i < 5;i++){
            freq[rank[i]]++;
            max = Math.max(max,freq[rank[i]]);
            set.add(suits[i]);
        }
        System.out.println(set + " " + max);
        return set.size() == 1 ? "Flush" : max >= 3 ? "Three of a Kind" : max == 2 ? "Pair" : "High Card";
    }
}
