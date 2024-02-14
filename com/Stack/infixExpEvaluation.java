package com.Stack;

import java.util.Stack;

public class infixExpEvaluation {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer> value = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            //  "0"-> 48 and "9"-> 57
            if (ascii>=48 && ascii <=57){
                value.push(ascii-48);
            } else if (operator.size()==0){
                operator.push(ch);
            }else {
                if (ch=='+' || ch == '-'){
                    //work
                    int val2= value.pop();
                    int val1= value.pop();
                    if (operator.peek()=='-') value.push(val1-val2);
                    if (operator.peek()=='+') value.push(val1+val2);
                    if (operator.peek()=='*') value.push(val1*val2);
                    if (operator.peek()=='/') value.push(val1/val2);
                    operator.pop();
                    //push
                    operator.push(ch);
                }
                if (ch=='*' || ch =='/'){
                    if (operator.peek()=='*' || operator.peek()=='/'){
//                        work
                        int val2= value.pop();
                        int val1= value.pop();
                        if (operator.peek()=='*') value.push(val1*val2);
                        if (operator.peek()=='/') value.push(val1/val2);
                        operator.pop();
                        //push
                        operator.push(ch);
                    }
                }
            }
        }
        while (value.size()>1 || operator.size() > 1){
            int val2= value.pop();
            int val1= value.pop();
            if (operator.peek()=='-') value.push(val1-val2);
            if (operator.peek()=='+') value.push(val1+val2);
            if (operator.peek()=='*') value.push(val1*val2);
            if (operator.peek()=='/') value.push(val1/val2);
            operator.pop();
        }
    }
}
