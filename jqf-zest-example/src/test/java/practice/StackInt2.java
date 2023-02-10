package practice;

import java.lang.*;
import java.util.*;
import edu.berkeley.cs.jqf.fuzz.*;

public class StackInt2 {
    
    private int maximum;
	private int ptr;

    Stack<Integer> stack = new Stack<Integer>();
	
	public class OverflowStackIntException extends RuntimeException{
		public OverflowStackIntException() {}
	}

    public class OutOfMemoryError extends RuntimeException{
        public OutOfMemoryError() {}
    }


    public StackInt2(int num) throws OutOfMemoryError{ // constractor
        this.maximum = num;
        
        if(num <=0){
            System.out.println("plese put an appropriate size");
            throw new OutOfMemoryError();
        }

		this.ptr = 0;
    }
    

    public Stack<Integer> push(int num) throws StackOverflowError{    // i have to make an excetion by myself
        // boolean containSame = stack.contains(num);
        // if(containSame){
        //     System.out.println("array alredy contains " + num);
        // }
        // else{
            if(this.ptr >= this.maximum){
                System.out.println("this is full");
                throw new StackOverflowError();
            }

            this.stack.push(num);
            System.out.println("s2 pushed " + num);
            this.ptr++;
        // }
        
        return this.stack;
        
    }
	
    public int pop(){ //An exception is thrown if we call pop() when the stack is empty.

        try{
            int result = 0;
            result = this.stack.pop();
            System.out.println("s2 popped " + result);
            --this.ptr;
            return result;
        }
        catch(EmptyStackException e){
            System.out.println("this stack is empty");
            throw new EmptyStackException();
        }

	}

    public String stackString(){
        return this.stack.toString();
    }

    public int size() {
        return stack.size(); 
    }

    public int peek(){
        return stack.peek();
    }

}