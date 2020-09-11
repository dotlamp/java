package algorithm.backjoon;

import java.util.Scanner;

public class Stack {
    private int[] stack;
    private int topIndex = -1;

    Stack(int number){
        this.stack = new int[number];
    }

    public void push(int x){
        this.stack[++topIndex] = x;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }else {
            return stack[topIndex--];
        }
    }

    public int size(){
        return topIndex+1;
    }

    public boolean isEmpty(){
        if(size()==0){
            return true;
        }else{
            return false;
        }
    }
    public int top(){
        if(isEmpty()){
            return -1;
        }else {
            return stack[topIndex];
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Stack stack = new Stack(number);

        for(int i=0; i<number; i++){
            String command = sc.next();

            switch (command){
                case "push" :
                    int x = sc.nextInt();
                    stack.push(x);
                    break;
                case "pop" :
                    System.out.println(stack.pop());
                    break;
                case "empty" :
                    if(stack.isEmpty()){
                        System.out.println(1);
                        break;
                    }else{
                        System.out.println(0);
                        break;
                    }
                case "top" :
                    System.out.println(stack.top());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
            }
        }

    }
}

/*
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Stack stack = new Stack();
		for(int i = 0; i <number; i++) {
			String command = scanner.next();
			switch(command) {
				case "push":
					int x = scanner.nextInt();
					stack.push(x);
					break;
				case "pop":
					if (stack.isEmpty())
						System.out.println(-1);
					else
						System.out.println(stack.pop());
					break;
				case "empty":
					if (stack.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "top":
					if (stack.isEmpty())
						System.out.println(-1);
					else
						System.out.println(stack.peek());
					break;
				case "size":
					System.out.println(stack.size());
					break;
			}
		}
	}
}
* */