class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int e:nums)
            map.put(e,map.getOrDefault(e,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> pri=new PriorityQueue<>((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        pri.addAll(map.entrySet());
        int i=0;
        int[] arr=new int[k];
        while(!pri.isEmpty() && i<k)
        {
            Map.Entry<Integer,Integer> val=pri.poll();
            arr[i++]=val.getKey();
        }
        return arr;
    }  
}
