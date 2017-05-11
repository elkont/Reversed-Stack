
	import java.util.Arrays;
	import java.util.Stack;
	
	public class ReverseStack {

	   public static Stack<Integer> reverse(Stack<Integer> initial) {
		   
	      Stack<Integer> reversedStack=new Stack<>();
	      
	       while (!initial.isEmpty()){
	       reversedStack.push(initial.pop());
	       }
	       return reversedStack;
	       }
       


    public static void main(String[] args) {
    	
        Stack<Integer> myStack = new Stack<>();
        myStack.addAll(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9,10}));// add numbers in Stack
        System.out.println("initial stack: " + myStack);
        System.out.println("reversed stack: " + reverse(myStack));
    }
}
