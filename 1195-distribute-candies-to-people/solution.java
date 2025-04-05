class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int idx = 0;
        int can = 1;
        while(candies > 0){
            arr[ idx++ % num_people ] += Math.min(can, candies);
            candies -= can;
            can++;
        }
        return arr;
    }
}
