package CrackingTheCodingInterview.DS.aTaleOfTwoStacks;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
    
    public static class MyQueue<T>{
        Stack<T> oldStack = new Stack<T>();
        Stack<T> newStack = new Stack<T>();
        
        public void enqueue(T data){
        	oldStack.push(data);
        }
        
        public T dequeue(){
        	checkStack();
            T data = newStack.pop();
            return data;
        }
        
        public T peek(){
        	checkStack();
            return newStack.peek();
        }
        
        private void checkStack() {
        	if(newStack.isEmpty()) {
        		while(!oldStack.isEmpty()){
                    newStack.push(oldStack.pop());
                }
        	}
        }
    }
    
    
    public static class MyQueue2<T>{
    	Stack<T> oldStack = new Stack<T>();
    	Stack<T> newStack = new Stack<T>();
    	
    	public void enqueue(T data){
    		if(newStack.isEmpty()){
    			newStack.push(data);
    		}
    		else{
    			oldStack.push(data);
    		}
    	}
    	
    	public T dequeue(){
    		T data = newStack.pop();
    		if(newStack.isEmpty()){
    			while(!oldStack.isEmpty()){
    				newStack.push(oldStack.pop());
    			}
    		}
    		return data;
    	}
    	
    	public T peek(){
    		
    		return newStack.peek();
    	}
    	
    	
    }
}
