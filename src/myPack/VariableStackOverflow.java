package myPack;
/*
 * Session 5 Assignment 4.
 */
public class VariableStackOverflow {

	public static void main(String[] args) {
		// TODO Make a program that checks the implementation of FixedStack and VariableStack.
		
		//For this test, both stacks will be initialized with the same size:4
		FixedStack myFixedStack = new FixedStack(4);
		VariableStack myVariableStack = new VariableStack(4);
		
		System.out.println("Pushing contents into myFixedStack");
		/*
		 * This loop will push 6 items into myFixedStack. The 'Stack Overflow' message should be
		 * printed out 2 times, because there is a maximum of 4 spots in this stack.
		 */
		for(int i=0; i<6; i++){
			myFixedStack.push(i*2);
		}
		
		//Output Separation
		System.out.println("-----------------------------------------");

		System.out.println("Pushing contents into myVariableStack");
		/*
		 * This loop will push 6 items into this myVariableStack. There should be no issues because
		 * it's capacity, though 4, should be incremented to accept all 6 items.
		 */
		for(int i=0; i<6; i++){
			myVariableStack.push(i*2);
		}
		
		//Output Separation
		System.out.println("\n-----------------------------------------");

		System.out.println("\nPopping contents out of myFixedStack");
		/*
		 * This loop will pop out 6 items from myFixedStack, which will be printed to screen.
		 * "Stack is empty" message should be printed 2 times after the 4th item because there should
		 * be nothing more to pop after the 4th item.
		 */
		for(int i=0; i<6; i++){
			System.out.print(myFixedStack.pop()+"\t");
		}

		//Output Separation
		System.out.println("\n-----------------------------------------");
		
		/*
		 * This loop will pop out 6 items from myFixedStack, which will be printed to screen. All 6
		 * items must be printed out to proove that the previous 6 pushes worked.
		 */
		System.out.println("Popping contents out of myVariableStack");
		for(int i=0; i<6; i++){
			System.out.print(myVariableStack.pop()+"\t");
		}
		
	}
}
