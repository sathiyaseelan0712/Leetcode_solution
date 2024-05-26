int myAtoi(char* a) {
    int i = 0;
    int sign = 1;
    long res = 0;
    while (a[i] == ' ')
        i++;
    if (a[i] == '+' || a[i] == '-') {
        if (a[i] == '-') {
            sign = -1;
        }
        i++;
    }
    while (a[i] >= '0' && a[i] <= '9') {
        res = res * 10 + (a[i] - '0');
        if (sign == 1 && res > INT_MAX) {
            return INT_MAX;
        } else if (sign == -1 && -res < INT_MIN) {
            return INT_MIN;
        }
        i++;
    }
    return (int)(sign * res);
}
