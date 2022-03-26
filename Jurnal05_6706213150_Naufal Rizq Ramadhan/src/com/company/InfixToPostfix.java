package com.company;


public class InfixToPostfix {
    private Stack stack;
    private String masukan;
    private String keluaran = "";


    public InfixToPostfix(String masuk) {
        masukan = masuk;
        int ukuranStack = masukan.length();
        stack = new Stack(ukuranStack);
    }

    public String doTrans() {
        for (int i = 0; i < masukan.length(); i++) {
            char ch = masukan.charAt(i);
            switch (ch) {
                case '+':
                case '-':
                    operator(ch, 1);
                    break;
                case '*':
                case '/':
                    operator(ch, 2);
                    break;
                case '^':
                    operator(ch, 3);
                    break;
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    keluaran = keluaran + ch;
                    break;
            }
        }
            return keluaran;
        }


    public void operator(char opThis, int prec1) {
        while (!stack.isEmpty()) {
            char opTop = stack.pop();
            if (opTop == '(') {
                stack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else if (opTop == '*' || opTop == '/') {
                    prec2 = 2;
                } else {
                    prec2 = 3;
                }
                if (prec2 < prec1) {
                    stack.push(opTop);
                    break;
                } else {
                    keluaran = keluaran + opTop;
                }
            }
        }
        stack.push(opThis);
    }

    public void gotParen(char ch) {
        while (!stack.isEmpty()) {
            char chx = stack.pop();
            if (chx == '(') {
                break;
            } else {
                keluaran = keluaran + chx;
            }
        }
    }
}




