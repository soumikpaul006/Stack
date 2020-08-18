package com.soumik;

import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        int[] push={1,2,3,4,5};
        int[] pop={4,5,3,2,1};
        boolean ans=validateStackSequences(push,pop);
        System.out.print(ans);
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped)
    {
        Stack<Integer> stack=new Stack<>();
        int pop_pointer=0;
        int len= pushed.length;
        for(int num:pushed)
        {
            stack.push(num);
            while(!stack.isEmpty() && stack.peek()==popped[pop_pointer])
            {
                stack.pop();
                pop_pointer++;
            }
        }
        return len==pop_pointer;

    }
}
