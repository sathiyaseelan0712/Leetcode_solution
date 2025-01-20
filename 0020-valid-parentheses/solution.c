bool isValid(char* s) {
    int top = -1;
    int n = strlen(s);
    int arr[n];
    for (int i = 0; i < n; i++) {
        char a = s[i];
        if (a == '(' || a == '[' || a == '{') {
            arr[++top] = a;
        } else {
            if (top == -1)
                return false;
            char b = arr[top--];
            if (a == ')' && b != '(')
                return false;
            else if (a == ']' && b != '[')
                return false;
            else if (a == '}' && b != '{')
                return false;
        }
    }
    return top == -1;
}
