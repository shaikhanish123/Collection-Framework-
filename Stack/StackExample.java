package Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        Stack stack=new Stack();
        stack.push("A");
        stack.push(1);
        stack.push("B");
        stack.push("apple");
        stack.push("amit");
        stack.push("123");
    // Object res= stack.peek();
    int a= stack.search("amit");
    System.out.println("position of element "+a);
    // System.out.println("peek element: "+res);
       for(int i=0;i<stack.size();i++){
        System.out.println("iterating stack: "+stack.get(i));

       }

    }
}