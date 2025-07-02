import java.util.Stack;

public class Solution {

    private int precedence(char x) {
        if (x == '+' || x == '-') {
            return 1;
        } else if (x == '*' || x == '/') {
            return 2;
        }
        return 0;
    }

    private String convertIntoPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                i++;
                continue;
            } else if (Character.isDigit(s.charAt(i))) {
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    postfix.append(s.charAt(i++));
                }
                postfix.append(',');
            } else {
                while (!st.isEmpty() && precedence(s.charAt(i)) <= precedence(st.peek())) {
                    postfix.append(st.pop());
                }
                st.push(s.charAt(i++));
            }
        }

        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }

        return postfix.toString();
    }

    private int evaluatePostfix(String postfix) {
        Stack<Integer> st = new Stack<>();
        int i = 0;

        while (i < postfix.length()) {
            if (postfix.charAt(i) == ',') {
                i++;
                continue;
            } else if (Character.isDigit(postfix.charAt(i))) {
                int temp = 0;
                while (i < postfix.length() && postfix.charAt(i) != ',') {
                    temp = temp * 10 + (postfix.charAt(i++) - '0');
                }
                st.push(temp);
            } else {
                int y = st.pop();
                int x = st.pop();
                char op = postfix.charAt(i++);
                switch (op) {
                    case '+':
                        st.push(x + y);
                        break;
                    case '-':
                        st.push(x - y);
                        break;
                    case '*':
                        st.push(x * y);
                        break;
                    case '/':
                        st.push(x / y);
                        break;
                }
            }
        }

        return st.peek();
    }

    public int calculate(String s) {
        String postfix = convertIntoPostfix(s);
        return evaluatePostfix(postfix);
    }
}

