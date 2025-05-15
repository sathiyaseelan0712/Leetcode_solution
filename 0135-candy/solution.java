class Solution {
    public int candy(int[] ratings) {
       int totalChildren = ratings.length;
        
        // Step 1: Initialize candies array with 1 candy for each child
        int[] candies = new int[totalChildren];
        Arrays.fill(candies, 1);

        // Step 2: Traverse from left to right
        for (int i = 1; i < totalChildren; i++) {
            if (ratings[i] > ratings[i - 1]) {
                // Give one more candy than the left child
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Traverse from right to left
        for (int i = totalChildren - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                // Ensure this child gets more candies than the right child
                candies[i] = candies[i + 1] + 1;
            }
        }

        // Step 4: Sum all candies
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}
