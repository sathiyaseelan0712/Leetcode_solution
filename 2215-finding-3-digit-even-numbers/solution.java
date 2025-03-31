class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] counts = new int[10];
        for(int d : digits){
            counts[d]++;
        }

        List<Integer> res = new ArrayList<>();
        int high,low,middle;
        boolean isTarget = false;

        for(int i = 100; i < 999; i += 2) {
            high = i  / 100;
            middle = i / 10 % 10;
            low = i % 10;
            isTarget = true;
            if(--counts[high] < 0) isTarget = false;
            if(--counts[middle] < 0) isTarget = false;
            if(--counts[low] < 0) isTarget = false;
            
            if(isTarget) res.add(i);

            counts[high]++;
            counts[middle]++;
            counts[low]++;
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
