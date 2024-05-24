int findTheWinner(int n, int k) {
    int pos = 0; 
    for (int i = 2; i <= n; i++) {
        pos = (pos + k) % i;
    }
    int ans=(pos+1);
    return ans;
}

