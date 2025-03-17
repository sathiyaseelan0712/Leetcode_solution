class Solution {
    public long sum(int[] arr){
        long sum = 0;
        for(int i : arr) sum += i;
        return sum;
    }
    public int chalkReplacer(int[] chalk, int k) {
         k %= sum(chalk);
        for(int i=0;i<chalk.length;i++){
            if(chalk[i] > k){
                return i;
            }
            k -= chalk[i];
        }
        return -1;
    }
}
