//run time complexit : 0(n)
//disadvantages
//slow for large data sets
//advantages
//fast for seaches of small to medium data sets
//does not need to sorted
//useful for data structures that do no have random acces (linked list)
public class LinearSeachs {
    public static void main(String[] args) {
        	// linear search = Iterate through a collection one element at a time
    	
    	int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
    	
    	int index = linearSearch(array, 5);
    	
    	if(index != -1) {
    		System.out.println("Element found at index: " + index);
    	}
    	else {
    		System.out.println("Element not found");
    	}
    		
    }

	private static int linearSearch(int[] array, int value) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return i;
			}
		}
		
		return -1;
	
    }
}
