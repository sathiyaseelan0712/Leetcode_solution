class Solution {
    public void sortColors(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add all elements to the priority queue
        for (int num : nums) {
            pq.add(num);
        }

        for (int i = nums.length-1; i >= 0; i--) {
            nums[i] = pq.poll();
        }
    }
}
