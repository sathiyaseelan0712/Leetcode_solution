class Solution {
public:
    int compute(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
    bool isHappy(int n) {
        // unordered_map<int,int> m;
        int slow = n, fast = n;
        do {
            slow = compute(slow);
            fast = compute(fast);
            fast = compute(fast);
        } while (fast != slow);

        if (fast == 1)
            return true;
        return false;
    }
};
