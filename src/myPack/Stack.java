package myPack;
/*
 * Create an interface Stack in package myPack with following methods
 * Create two subclasses inheriting the Stack interface.
 * The concept of Stacks is to add items on top of the others, and remove
 * them by taking the top-most item first. In other words: Last in, First out.
 * This concept will be implemented in all classes that inherit this interface. 
 */
public interface Stack {
	//All methods in the interface are abstract
	abstract void push(int I);
	abstract int pop();
	
}

