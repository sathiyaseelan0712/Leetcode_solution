bool checkPerfectNumber(int num) {
    if (num <= 1)
        return 0;; 
    int sum = 1;
    int s_num = (int)sqrt(num);
    for (int i = 2; i <= s_num; ++i)
    {
        if (num % i == 0)
        {
            sum += i;  
            if (i != num / i)
            {
            sum += num /i;
            }
        }
    }
    return sum == num;
}
