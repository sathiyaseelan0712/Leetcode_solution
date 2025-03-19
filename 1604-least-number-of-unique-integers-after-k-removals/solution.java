class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);  
        }        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(map.values());
        int n = pq.size();
        while(k > 0 && !pq.isEmpty()){
            int f = pq.peek();
            k -= f;
            if( k >= 0){
                pq.poll();
            }
            
        }
        return pq.size();
    }
}
