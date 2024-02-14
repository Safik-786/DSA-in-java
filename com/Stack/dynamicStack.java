package com.Stack;

public class dynamicStack extends StackUsingArray {
    dynamicStack(int size) {
        super(size);            //this will call the custom stack
    }

    @Override
    public boolean push(int x) {
        if (this.isFull()){
//            double the size of array
            int [] temp= new int[arr.length * 2 ];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            } 
            arr= temp;
        }
//        INSERT ELEMENT NORMALLY
        return super.push(x);
    }
}
