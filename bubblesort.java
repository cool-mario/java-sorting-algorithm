
class Main {
    public static void main(String[] args) {
    	int[] testing = new int[20];
    	for (int i = 0; i < 20; i++){
    	  testing[i] = (int)(Math.random()*50);
    	}
    	for (int i:testing){
    	  System.out.print(i + " ");
    	}
    	
    	System.out.println("\n");
    	
    	for (int i:bubble(testing)){
    	  System.out.print(i + " ");
    	}
    	
    }
    
    public static int[] bubble(int[] unsorted){
      
      for (int i = unsorted.length-1; i > 0; i--){  //go down from the top because the top ones get sorted first
        for (int a = 0; a < i; a++){                // start from the bottom and end to the sorted things
          
          if (unsorted[a] > unsorted[a+1]){       // check if 2 are sorted
            int temp = unsorted[a+1];             // swap items in array!
            unsorted[a+1] = unsorted[a];
            unsorted[a] = temp;
          }
          
        }
      }
      
      return unsorted;
    }
    
}

/*
for i -> end of list:  
    for j -> i:  
        swap the 2 values if need be  

do

  swapped = false

  for i = 1 to indexOfLastUnsortedElement-1

    if leftElement > rightElement

      swap(leftElement, rightElement)

      swapped = true; ++swapCounter

while swapped
        */
