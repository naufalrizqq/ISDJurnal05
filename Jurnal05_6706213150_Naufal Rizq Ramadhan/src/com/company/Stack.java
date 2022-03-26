package com.company;

public class Stack {
    private int top;
    private int ukuranMaks;
    private char[] stackArr;


    public Stack(int maksimal) {
        ukuranMaks = maksimal;
        stackArr = new char[ukuranMaks];
        top=-1;
    }

    public void push(char i ){
        stackArr[++top] = i;
    }

    public char pop(){
        return stackArr[top--];
    }

    public char peek(){
        return stackArr[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }
}


