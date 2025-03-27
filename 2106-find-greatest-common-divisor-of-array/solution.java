class Solution {
    public int gcd(int a,int b){
        if( b == 0) return a;
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums) pq.add(i);
        int max = Integer.MIN_VALUE;
        for (int num : pq) {
            max = Math.max(max, num);
        }
        return gcd(max,pq.peek());
    }
}
