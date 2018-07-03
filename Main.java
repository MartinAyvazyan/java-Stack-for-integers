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
		System.out.println("Poped" + stack.pop());
		System.out.println("Array" + stack.toString());
	}

}

class Stack {
	private int[] arr = new int[28];
	private int index = 0;
	
	boolean isEmpty(int index){
	    if(index - 1 <=0){
		return true;
	    }
          return false;
	}
	
	boolean isFull(int index){
	    if(index + 1 > 27){
	  	return true;
	    }
	  return false;
	}

        void push(int newItem){
	    if(isFull(index)){
		 return;
 	    }
	  arr[index] = newItem;	
	  index++;
	}

	int pop(){
	    if(isEmpty(index)){
	       return 0;
	    }
	  int deletedItem = arr[index-1];
	  index--;
	  return deletedItem;
	}

	int peek(){
	    if(isEmpty(index)){
		return 0;
	    }
	    return arr[index-1];
	}  

	public String toString(){
	  return Arrays.toString(arr);
	}
}

