package com.Queue;

import java.util.Stack;
        //      BASED UPON CONSTANT EFFICIENCY OF DELETION
public class queueUsingStack
{
    private Stack<Integer> firstStk ;
    private Stack<Integer> secondStk ;
    public queueUsingStack() {
        firstStk = new Stack<Integer>();
        secondStk = new Stack<Integer>();
    }
    public int dequeue() throws Exception
    {
        return  firstStk.pop();
    }
    public void enqueue(int data) throws Exception {
//        move all element to stk2 from stk1
        while (!firstStk.isEmpty()){
            secondStk.push(firstStk.pop());
        }
//        insert element at stk1
        firstStk.push(data);
        while (!secondStk.isEmpty()) {
            firstStk.push(secondStk.pop());
        }
    }
    public void display()throws Exception {
        System.out.println(firstStk);
    }
    public int peek()throws Exception {
        return firstStk.peek();
    }

    public static void main(String[] args)  throws Exception{
        queueUsingStack stk = new queueUsingStack();
        stk.enqueue(54);
        stk.enqueue(76);
        stk.enqueue(23);
        stk.display();
        System.out.println(stk.dequeue());
        System.out.println("peek element "+stk.peek());
    }

}
