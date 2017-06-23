package myPack;
/*
 * class VariableStack inherits Stack interface, and can accept numbers more than its size. 
 * The size of the Stack will be specified in the constructor. If the number of integers
 * exceeds the size, the stack should automatically grow to accommodate the new element.
 */
public class VariableStack implements Stack {

	private int[] arrayStack;			//This array will hold the items of FixedStack.
	
	/*
	 * arrayIncrement is the factor by which every array size will grow when needed. It will be initialized
	 * when constructor is called.
	 */
	private int arrayIncrement;
	
	private int position = 0;		//This will hold the current array position for the next item to be pushed.
	
	//This constructor will initialize the array size, and arrayIncrement with the integer provided.
	VariableStack(int size){
		this.arrayStack = new int[size];
		this.arrayIncrement = size;	
	}
	

	//This method will add a new item to the array
	@Override
	public void push(int i){
		if(position < arrayStack.length){	//Verify that the position isn't outside the upper-bound of the array
			arrayStack[position] = i;		//If it's within array bounds, that position will hold the pushed item
			position++;						//position will now hold the next position
		}
		else					//If the position is outside the upper-bound, the else statement will call
			increaseStack(i);	//increaseStack method to increase the capacity of VariableStack.
	}
	
	// This method will increase the capacity of VaraibleStack when capacity is exceeded during a push.
	private void increaseStack(int i){
		/*
		 * A new array will be created which is larger based on the initial size given through the
		 * constructor. "new Array size" = "current array size" + "initially set array size"
		 */
		int[] newArray = new int[position+arrayIncrement];
		
		for(int index=0; index<position; index++){
			newArray[index] = arrayStack[index];
		}
		
		newArray[position] = i;
		position++;
		arrayStack = newArray;
	}

	
	//This method will return the last item pushed onto the array.
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
		//If the position is outside the lower-bound, nothing will be done to the array. And this message will print.
		else
			System.out.println("\nStack is empty!");
		return 0;	//returning 0 because the method requires that an int be returned
	}
	

}
