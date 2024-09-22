int bitwise_add(int x, int y) {
    while (y != 0) {
        int carry = (x & y) << 1;  
        x = x ^ y;                 
        y = carry;                
    }
    return x;
}

int fib(int n) {
    int a = 0, b = 1, temp;

    if (n == 0) return a; 
    if (n == 1) return b;  
    for (int i = 2; i <= n; i++) {
        temp = bitwise_add(a, b); 
        a = b;
        b = temp;
    }

    return b; 
}
