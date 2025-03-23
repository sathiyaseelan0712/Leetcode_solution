class Solution {
    public int sum(int n){
        int sum = 0;
        while(n  != 0){
            int rem = n%10;
            sum = sum+rem*rem;
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> ans = new HashSet<>();
        ans.add(n);
        while(n != 1){
            int rem = sum(n);
            System.out.println(rem);
            if(ans.contains(rem)) return false;
            ans.add(rem);
            n = rem;
        }
        return true;
    }
}
