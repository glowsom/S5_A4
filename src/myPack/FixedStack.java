package myPack;
/*
 * FixedStack inherits Stack interface, and can accept a fixed numbers of integers. The size of the Stack will be specified
 * in the constructor. If the number of integers exceeds the size, “Stack overflow” message should be displayed.
 */
public class FixedStack implements Stack{
	
	private int[] arrayStack;		//This array will hold the items of FixedStack.
	
	private int position = 0;		//This will hold the current array position for the next item to be pushed.
	
	//This constructor will initialize the array with the integer given by the user.
	FixedStack(int size){
		this.arrayStack = new int[size];
	}
	
	//This method will add a new item to the array
	@Override
	public void push(int i){
		if(position < arrayStack.length){	//Verify that the position isn't outside the upper-bound of the array
			arrayStack[position] = i;		//If it's within array bounds, that position will hold the pushed item
			position++;						//position will now hold the next position
		}
		//If the position is outside the upper-bound, nothing will be done to the array. And this message will print.
		else
			System.out.println("Stack Overflow.");		
	}
	
	//This method will return the last item pushed onto the array.
	@Override
	public int pop(){
		/*
		 * Because position points to the spot waiting for the next push, the last item that was pushed will reside
		 * in the spot that comes before position. To make sure position ends up in the next available spot,
		 * it must be decremented by 1. This also happens to be the same spot of the item that must be popped out.
		 * 
		 * Before that, this if-statement checks to make sure position will not end up outside the lower-bound of
		 * array. 
		 */
		if(position >0){ 
			position--;						//Decrements position to what will be it's current spot.
			return arrayStack[position];	//Returns the item in position's current spot to make room for next push.
		}
		else											//If the position is outside the lower-bound, nothing will be
			System.out.println("\nStack is empty!");	//done to the array. And this message will print.
		return 0;	//returning 0 because the method requires that an int be returned
	}
}
