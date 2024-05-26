bool isValid(char *s) {
    char stack[100000]; 
    int top = -1; 
    int len = strlen(s);
    for (int i = 0; i < len; i++) {
        char a= s[i];
        if (a== '(' || a == '{' || a == '[') {
            stack[++top] = a;
        } 
        else {
            if (top == -1) 
                return false; 
            char topel = stack[top--];
            if (a == ')' && topel != '(')
                return false;
            if (a == '}' && topel != '{') 
                return false;
            if (a == ']' && topel != '[')
                return false;
        }
    }

    return top == -1;
}
