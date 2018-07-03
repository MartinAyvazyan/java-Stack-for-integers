import java.util.Arrays;

class Main {

	public static void main(String... args){
		Stack stack = new Stack();
//		stack.push(1);
		stack.push(2);
		stack.pop();
//		stack.push(3);
		stack.pop();
		stack.push(4);
//		System.out.println("Poped" + stack.pop());
		System.out.println("Array" + stack.toString());
	}

}

class Stack {
	private int[] arr = new int[28];
	private int index = 0;
	
	boolean isEmpty(){
	    if(index - 1 == -1){
		return true;
	    }
          return false;
	}
	
	boolean isFull(){
	    if(index + 1 == arr.length+1){
	  	return true;
	    }
	  return false;
	}

        void push(int newItem){
	    if(isFull()){
		 return;
 	    }
	  arr[index] = newItem;	
	  index++;
	}

	int pop(){
	    if(isEmpty()){
	       return 0;
	    }
	  int deletedItem = arr[index-1];
	  index--;
	  return deletedItem;
	}

	int peek(){
	    if(isEmpty()){
		return 0;
	    }
	    return arr[index-1];
	}  

	public String toString(){
	  return Arrays.toString(arr);
	}
}

